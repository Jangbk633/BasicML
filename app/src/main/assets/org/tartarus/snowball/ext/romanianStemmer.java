// Generated by Snowball 2.2.0 - https://snowballstem.org/

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

/**
 * This class implements the stemming algorithm defined by a snowball script.
 * <p>
 * Generated by Snowball 2.2.0 - https://snowballstem.org/
 * </p>
 */
@SuppressWarnings("unused")
public class romanianStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among a_0[] = {
    new Among("", -1, 3),
    new Among("I", 0, 1),
    new Among("U", 0, 2)
};

private final static Among a_1[] = {
    new Among("ea", -1, 3),
    new Among("a\u0163ia", -1, 7),
    new Among("aua", -1, 2),
    new Among("iua", -1, 4),
    new Among("a\u0163ie", -1, 7),
    new Among("ele", -1, 3),
    new Among("ile", -1, 5),
    new Among("iile", 6, 4),
    new Among("iei", -1, 4),
    new Among("atei", -1, 6),
    new Among("ii", -1, 4),
    new Among("ului", -1, 1),
    new Among("ul", -1, 1),
    new Among("elor", -1, 3),
    new Among("ilor", -1, 4),
    new Among("iilor", 14, 4)
};

private final static Among a_2[] = {
    new Among("icala", -1, 4),
    new Among("iciva", -1, 4),
    new Among("ativa", -1, 5),
    new Among("itiva", -1, 6),
    new Among("icale", -1, 4),
    new Among("a\u0163iune", -1, 5),
    new Among("i\u0163iune", -1, 6),
    new Among("atoare", -1, 5),
    new Among("itoare", -1, 6),
    new Among("\u0103toare", -1, 5),
    new Among("icitate", -1, 4),
    new Among("abilitate", -1, 1),
    new Among("ibilitate", -1, 2),
    new Among("ivitate", -1, 3),
    new Among("icive", -1, 4),
    new Among("ative", -1, 5),
    new Among("itive", -1, 6),
    new Among("icali", -1, 4),
    new Among("atori", -1, 5),
    new Among("icatori", 18, 4),
    new Among("itori", -1, 6),
    new Among("\u0103tori", -1, 5),
    new Among("icitati", -1, 4),
    new Among("abilitati", -1, 1),
    new Among("ivitati", -1, 3),
    new Among("icivi", -1, 4),
    new Among("ativi", -1, 5),
    new Among("itivi", -1, 6),
    new Among("icit\u0103i", -1, 4),
    new Among("abilit\u0103i", -1, 1),
    new Among("ivit\u0103i", -1, 3),
    new Among("icit\u0103\u0163i", -1, 4),
    new Among("abilit\u0103\u0163i", -1, 1),
    new Among("ivit\u0103\u0163i", -1, 3),
    new Among("ical", -1, 4),
    new Among("ator", -1, 5),
    new Among("icator", 35, 4),
    new Among("itor", -1, 6),
    new Among("\u0103tor", -1, 5),
    new Among("iciv", -1, 4),
    new Among("ativ", -1, 5),
    new Among("itiv", -1, 6),
    new Among("ical\u0103", -1, 4),
    new Among("iciv\u0103", -1, 4),
    new Among("ativ\u0103", -1, 5),
    new Among("itiv\u0103", -1, 6)
};

private final static Among a_3[] = {
    new Among("ica", -1, 1),
    new Among("abila", -1, 1),
    new Among("ibila", -1, 1),
    new Among("oasa", -1, 1),
    new Among("ata", -1, 1),
    new Among("ita", -1, 1),
    new Among("anta", -1, 1),
    new Among("ista", -1, 3),
    new Among("uta", -1, 1),
    new Among("iva", -1, 1),
    new Among("ic", -1, 1),
    new Among("ice", -1, 1),
    new Among("abile", -1, 1),
    new Among("ibile", -1, 1),
    new Among("isme", -1, 3),
    new Among("iune", -1, 2),
    new Among("oase", -1, 1),
    new Among("ate", -1, 1),
    new Among("itate", 17, 1),
    new Among("ite", -1, 1),
    new Among("ante", -1, 1),
    new Among("iste", -1, 3),
    new Among("ute", -1, 1),
    new Among("ive", -1, 1),
    new Among("ici", -1, 1),
    new Among("abili", -1, 1),
    new Among("ibili", -1, 1),
    new Among("iuni", -1, 2),
    new Among("atori", -1, 1),
    new Among("osi", -1, 1),
    new Among("ati", -1, 1),
    new Among("itati", 30, 1),
    new Among("iti", -1, 1),
    new Among("anti", -1, 1),
    new Among("isti", -1, 3),
    new Among("uti", -1, 1),
    new Among("i\u015Fti", -1, 3),
    new Among("ivi", -1, 1),
    new Among("it\u0103i", -1, 1),
    new Among("o\u015Fi", -1, 1),
    new Among("it\u0103\u0163i", -1, 1),
    new Among("abil", -1, 1),
    new Among("ibil", -1, 1),
    new Among("ism", -1, 3),
    new Among("ator", -1, 1),
    new Among("os", -1, 1),
    new Among("at", -1, 1),
    new Among("it", -1, 1),
    new Among("ant", -1, 1),
    new Among("ist", -1, 3),
    new Among("ut", -1, 1),
    new Among("iv", -1, 1),
    new Among("ic\u0103", -1, 1),
    new Among("abil\u0103", -1, 1),
    new Among("ibil\u0103", -1, 1),
    new Among("oas\u0103", -1, 1),
    new Among("at\u0103", -1, 1),
    new Among("it\u0103", -1, 1),
    new Among("ant\u0103", -1, 1),
    new Among("ist\u0103", -1, 3),
    new Among("ut\u0103", -1, 1),
    new Among("iv\u0103", -1, 1)
};

private final static Among a_4[] = {
    new Among("ea", -1, 1),
    new Among("ia", -1, 1),
    new Among("esc", -1, 1),
    new Among("\u0103sc", -1, 1),
    new Among("ind", -1, 1),
    new Among("\u00E2nd", -1, 1),
    new Among("are", -1, 1),
    new Among("ere", -1, 1),
    new Among("ire", -1, 1),
    new Among("\u00E2re", -1, 1),
    new Among("se", -1, 2),
    new Among("ase", 10, 1),
    new Among("sese", 10, 2),
    new Among("ise", 10, 1),
    new Among("use", 10, 1),
    new Among("\u00E2se", 10, 1),
    new Among("e\u015Fte", -1, 1),
    new Among("\u0103\u015Fte", -1, 1),
    new Among("eze", -1, 1),
    new Among("ai", -1, 1),
    new Among("eai", 19, 1),
    new Among("iai", 19, 1),
    new Among("sei", -1, 2),
    new Among("e\u015Fti", -1, 1),
    new Among("\u0103\u015Fti", -1, 1),
    new Among("ui", -1, 1),
    new Among("ezi", -1, 1),
    new Among("\u00E2i", -1, 1),
    new Among("a\u015Fi", -1, 1),
    new Among("se\u015Fi", -1, 2),
    new Among("ase\u015Fi", 29, 1),
    new Among("sese\u015Fi", 29, 2),
    new Among("ise\u015Fi", 29, 1),
    new Among("use\u015Fi", 29, 1),
    new Among("\u00E2se\u015Fi", 29, 1),
    new Among("i\u015Fi", -1, 1),
    new Among("u\u015Fi", -1, 1),
    new Among("\u00E2\u015Fi", -1, 1),
    new Among("a\u0163i", -1, 2),
    new Among("ea\u0163i", 38, 1),
    new Among("ia\u0163i", 38, 1),
    new Among("e\u0163i", -1, 2),
    new Among("i\u0163i", -1, 2),
    new Among("\u00E2\u0163i", -1, 2),
    new Among("ar\u0103\u0163i", -1, 1),
    new Among("ser\u0103\u0163i", -1, 2),
    new Among("aser\u0103\u0163i", 45, 1),
    new Among("seser\u0103\u0163i", 45, 2),
    new Among("iser\u0103\u0163i", 45, 1),
    new Among("user\u0103\u0163i", 45, 1),
    new Among("\u00E2ser\u0103\u0163i", 45, 1),
    new Among("ir\u0103\u0163i", -1, 1),
    new Among("ur\u0103\u0163i", -1, 1),
    new Among("\u00E2r\u0103\u0163i", -1, 1),
    new Among("am", -1, 1),
    new Among("eam", 54, 1),
    new Among("iam", 54, 1),
    new Among("em", -1, 2),
    new Among("asem", 57, 1),
    new Among("sesem", 57, 2),
    new Among("isem", 57, 1),
    new Among("usem", 57, 1),
    new Among("\u00E2sem", 57, 1),
    new Among("im", -1, 2),
    new Among("\u00E2m", -1, 2),
    new Among("\u0103m", -1, 2),
    new Among("ar\u0103m", 65, 1),
    new Among("ser\u0103m", 65, 2),
    new Among("aser\u0103m", 67, 1),
    new Among("seser\u0103m", 67, 2),
    new Among("iser\u0103m", 67, 1),
    new Among("user\u0103m", 67, 1),
    new Among("\u00E2ser\u0103m", 67, 1),
    new Among("ir\u0103m", 65, 1),
    new Among("ur\u0103m", 65, 1),
    new Among("\u00E2r\u0103m", 65, 1),
    new Among("au", -1, 1),
    new Among("eau", 76, 1),
    new Among("iau", 76, 1),
    new Among("indu", -1, 1),
    new Among("\u00E2ndu", -1, 1),
    new Among("ez", -1, 1),
    new Among("easc\u0103", -1, 1),
    new Among("ar\u0103", -1, 1),
    new Among("ser\u0103", -1, 2),
    new Among("aser\u0103", 84, 1),
    new Among("seser\u0103", 84, 2),
    new Among("iser\u0103", 84, 1),
    new Among("user\u0103", 84, 1),
    new Among("\u00E2ser\u0103", 84, 1),
    new Among("ir\u0103", -1, 1),
    new Among("ur\u0103", -1, 1),
    new Among("\u00E2r\u0103", -1, 1),
    new Among("eaz\u0103", -1, 1)
};

private final static Among a_5[] = {
    new Among("a", -1, 1),
    new Among("e", -1, 1),
    new Among("ie", 1, 1),
    new Among("i", -1, 1),
    new Among("\u0103", -1, 1)
};

private static final char g_v[] = {17, 65, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 32, 0, 0, 4 };

private boolean B_standard_suffix_removed;
private int I_p2;
private int I_p1;
private int I_pV;


private boolean r_prelude() {
    while(true)
    {
        int v_1 = cursor;
        lab0: {
            golab1: while(true)
            {
                int v_2 = cursor;
                lab2: {
                    if (!(in_grouping(g_v, 97, 259)))
                    {
                        break lab2;
                    }
                    bra = cursor;
                    lab3: {
                        int v_3 = cursor;
                        lab4: {
                            if (!(eq_s("u")))
                            {
                                break lab4;
                            }
                            ket = cursor;
                            if (!(in_grouping(g_v, 97, 259)))
                            {
                                break lab4;
                            }
                            slice_from("U");
                            break lab3;
                        }
                        cursor = v_3;
                        if (!(eq_s("i")))
                        {
                            break lab2;
                        }
                        ket = cursor;
                        if (!(in_grouping(g_v, 97, 259)))
                        {
                            break lab2;
                        }
                        slice_from("I");
                    }
                    cursor = v_2;
                    break golab1;
                }
                cursor = v_2;
                if (cursor >= limit)
                {
                    break lab0;
                }
                cursor++;
            }
            continue;
        }
        cursor = v_1;
        break;
    }
    return true;
}

private boolean r_mark_regions() {
    I_pV = limit;
    I_p1 = limit;
    I_p2 = limit;
    int v_1 = cursor;
    lab0: {
        lab1: {
            int v_2 = cursor;
            lab2: {
                if (!(in_grouping(g_v, 97, 259)))
                {
                    break lab2;
                }
                lab3: {
                    int v_3 = cursor;
                    lab4: {
                        if (!(out_grouping(g_v, 97, 259)))
                        {
                            break lab4;
                        }
                        golab5: while(true)
                        {
                            lab6: {
                                if (!(in_grouping(g_v, 97, 259)))
                                {
                                    break lab6;
                                }
                                break golab5;
                            }
                            if (cursor >= limit)
                            {
                                break lab4;
                            }
                            cursor++;
                        }
                        break lab3;
                    }
                    cursor = v_3;
                    if (!(in_grouping(g_v, 97, 259)))
                    {
                        break lab2;
                    }
                    golab7: while(true)
                    {
                        lab8: {
                            if (!(out_grouping(g_v, 97, 259)))
                            {
                                break lab8;
                            }
                            break golab7;
                        }
                        if (cursor >= limit)
                        {
                            break lab2;
                        }
                        cursor++;
                    }
                }
                break lab1;
            }
            cursor = v_2;
            if (!(out_grouping(g_v, 97, 259)))
            {
                break lab0;
            }
            lab9: {
                int v_6 = cursor;
                lab10: {
                    if (!(out_grouping(g_v, 97, 259)))
                    {
                        break lab10;
                    }
                    golab11: while(true)
                    {
                        lab12: {
                            if (!(in_grouping(g_v, 97, 259)))
                            {
                                break lab12;
                            }
                            break golab11;
                        }
                        if (cursor >= limit)
                        {
                            break lab10;
                        }
                        cursor++;
                    }
                    break lab9;
                }
                cursor = v_6;
                if (!(in_grouping(g_v, 97, 259)))
                {
                    break lab0;
                }
                if (cursor >= limit)
                {
                    break lab0;
                }
                cursor++;
            }
        }
        I_pV = cursor;
    }
    cursor = v_1;
    int v_8 = cursor;
    lab13: {
        golab14: while(true)
        {
            lab15: {
                if (!(in_grouping(g_v, 97, 259)))
                {
                    break lab15;
                }
                break golab14;
            }
            if (cursor >= limit)
            {
                break lab13;
            }
            cursor++;
        }
        golab16: while(true)
        {
            lab17: {
                if (!(out_grouping(g_v, 97, 259)))
                {
                    break lab17;
                }
                break golab16;
            }
            if (cursor >= limit)
            {
                break lab13;
            }
            cursor++;
        }
        I_p1 = cursor;
        golab18: while(true)
        {
            lab19: {
                if (!(in_grouping(g_v, 97, 259)))
                {
                    break lab19;
                }
                break golab18;
            }
            if (cursor >= limit)
            {
                break lab13;
            }
            cursor++;
        }
        golab20: while(true)
        {
            lab21: {
                if (!(out_grouping(g_v, 97, 259)))
                {
                    break lab21;
                }
                break golab20;
            }
            if (cursor >= limit)
            {
                break lab13;
            }
            cursor++;
        }
        I_p2 = cursor;
    }
    cursor = v_8;
    return true;
}

private boolean r_postlude() {
    int among_var;
    while(true)
    {
        int v_1 = cursor;
        lab0: {
            bra = cursor;
            among_var = find_among(a_0);
            if (among_var == 0)
            {
                break lab0;
            }
            ket = cursor;
            switch (among_var) {
                case 1:
                    slice_from("i");
                    break;
                case 2:
                    slice_from("u");
                    break;
                case 3:
                    if (cursor >= limit)
                    {
                        break lab0;
                    }
                    cursor++;
                    break;
            }
            continue;
        }
        cursor = v_1;
        break;
    }
    return true;
}

private boolean r_RV() {
    if (!(I_pV <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_R1() {
    if (!(I_p1 <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_R2() {
    if (!(I_p2 <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_step_0() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_1);
    if (among_var == 0)
    {
        return false;
    }
    bra = cursor;
    if (!r_R1())
    {
        return false;
    }
    switch (among_var) {
        case 1:
            slice_del();
            break;
        case 2:
            slice_from("a");
            break;
        case 3:
            slice_from("e");
            break;
        case 4:
            slice_from("i");
            break;
        case 5:
            {
                int v_1 = limit - cursor;
                lab0: {
                    if (!(eq_s_b("ab")))
                    {
                        break lab0;
                    }
                    return false;
                }
                cursor = limit - v_1;
            }
            slice_from("i");
            break;
        case 6:
            slice_from("at");
            break;
        case 7:
            slice_from("a\u0163i");
            break;
    }
    return true;
}

private boolean r_combo_suffix() {
    int among_var;
    int v_1 = limit - cursor;
    ket = cursor;
    among_var = find_among_b(a_2);
    if (among_var == 0)
    {
        return false;
    }
    bra = cursor;
    if (!r_R1())
    {
        return false;
    }
    switch (among_var) {
        case 1:
            slice_from("abil");
            break;
        case 2:
            slice_from("ibil");
            break;
        case 3:
            slice_from("iv");
            break;
        case 4:
            slice_from("ic");
            break;
        case 5:
            slice_from("at");
            break;
        case 6:
            slice_from("it");
            break;
    }
    B_standard_suffix_removed = true;
    cursor = limit - v_1;
    return true;
}

private boolean r_standard_suffix() {
    int among_var;
    B_standard_suffix_removed = false;
    while(true)
    {
        int v_1 = limit - cursor;
        lab0: {
            if (!r_combo_suffix())
            {
                break lab0;
            }
            continue;
        }
        cursor = limit - v_1;
        break;
    }
    ket = cursor;
    among_var = find_among_b(a_3);
    if (among_var == 0)
    {
        return false;
    }
    bra = cursor;
    if (!r_R2())
    {
        return false;
    }
    switch (among_var) {
        case 1:
            slice_del();
            break;
        case 2:
            if (!(eq_s_b("\u0163")))
            {
                return false;
            }
            bra = cursor;
            slice_from("t");
            break;
        case 3:
            slice_from("ist");
            break;
    }
    B_standard_suffix_removed = true;
    return true;
}

private boolean r_verb_suffix() {
    int among_var;
    if (cursor < I_pV)
    {
        return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_pV;
    ket = cursor;
    among_var = find_among_b(a_4);
    if (among_var == 0)
    {
        limit_backward = v_2;
        return false;
    }
    bra = cursor;
    switch (among_var) {
        case 1:
            lab0: {
                int v_3 = limit - cursor;
                lab1: {
                    if (!(out_grouping_b(g_v, 97, 259)))
                    {
                        break lab1;
                    }
                    break lab0;
                }
                cursor = limit - v_3;
                if (!(eq_s_b("u")))
                {
                    limit_backward = v_2;
                    return false;
                }
            }
            slice_del();
            break;
        case 2:
            slice_del();
            break;
    }
    limit_backward = v_2;
    return true;
}

private boolean r_vowel_suffix() {
    ket = cursor;
    if (find_among_b(a_5) == 0)
    {
        return false;
    }
    bra = cursor;
    if (!r_RV())
    {
        return false;
    }
    slice_del();
    return true;
}

public boolean stem() {
    int v_1 = cursor;
    r_prelude();
    cursor = v_1;
    r_mark_regions();
    limit_backward = cursor;
    cursor = limit;
    int v_3 = limit - cursor;
    r_step_0();
    cursor = limit - v_3;
    int v_4 = limit - cursor;
    r_standard_suffix();
    cursor = limit - v_4;
    int v_5 = limit - cursor;
    lab0: {
        lab1: {
            int v_6 = limit - cursor;
            lab2: {
                if (!(B_standard_suffix_removed))
                {
                    break lab2;
                }
                break lab1;
            }
            cursor = limit - v_6;
            if (!r_verb_suffix())
            {
                break lab0;
            }
        }
    }
    cursor = limit - v_5;
    int v_7 = limit - cursor;
    r_vowel_suffix();
    cursor = limit - v_7;
    cursor = limit_backward;
    int v_8 = cursor;
    r_postlude();
    cursor = v_8;
    return true;
}

@Override
public boolean equals( Object o ) {
    return o instanceof romanianStemmer;
}

@Override
public int hashCode() {
    return romanianStemmer.class.getName().hashCode();
}



}

