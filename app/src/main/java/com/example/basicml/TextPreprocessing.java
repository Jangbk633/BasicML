package com.example.basicml;
import com.google.gson.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
public class TextPreprocessing {
    // 1. JSON 파일에서 Tokenizer 로드
    public static Map<String, Integer> loadTokenizer(String filePath) throws IOException {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(filePath)) {
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonObject wordIndex = jsonObject.getAsJsonObject("config").getAsJsonObject("word_index");

            // JSON에서 단어-인덱스 매핑 추출
            Map<String, Integer> wordMap = new HashMap<>();
            for (Map.Entry<String, JsonElement> entry : wordIndex.entrySet()) {
                wordMap.put(entry.getKey(), entry.getValue().getAsInt());
            }
            return wordMap;
        }
    }

    // 2. 텍스트 데이터를 소문자로 변환
    public static List<String> toLowerCase(List<String> texts) {
        return texts.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    // 3. 정규 표현식으로 텍스트 정리
    public static List<String> cleanText(List<String> texts) {
        return texts.stream()
                .map(text -> text.replaceAll("[^a-z\\s]", ""))
                .collect(Collectors.toList());
    }

    // 4. 어간 추출 (간단한 Stemming 함수)
    public static List<String> stemWords(List<String> texts) {
        return texts.stream()
                .map(text -> Arrays.stream(text.split("\\s+"))
                        .map(TextPreprocessing::stem)
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.toList());
    }

    public static String stem(String word) {
        if (word.endsWith("ing")) {
            return word.substring(0, word.length() - 3);
        } else if (word.endsWith("ed")) {
            return word.substring(0, word.length() - 2);
        } else if (word.endsWith("s")) {
            return word.substring(0, word.length() - 1);
        }
        return word;
    }

    // 5. 텍스트를 시퀀스로 변환
    public static List<List<Integer>> textsToSequences(List<String> texts, Map<String, Integer> wordIndex) {
        List<List<Integer>> sequences = new ArrayList<>();
        for (String text : texts) {
            List<Integer> sequence = new ArrayList<>();
            for (String word : text.split("\\s+")) {
                sequence.add(wordIndex.getOrDefault(word, 0)); // 단어가 없으면 0 추가
            }
            sequences.add(sequence);
        }
        return sequences;
    }

    // 6. 시퀀스를 벡터화
    public static double[][] vectorizeSequences(List<List<Integer>> sequences, int dimension) {
        double[][] results = new double[sequences.size()][dimension];
        for (int i = 0; i < sequences.size(); i++) {
            for (int index : sequences.get(i)) {
                if (index < dimension) {
                    results[i][index] = 1.0; // 해당 위치를 1로 설정
                }
            }
        }
        return results;
    }
}
