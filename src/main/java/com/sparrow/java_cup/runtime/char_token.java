
package com.sparrow.java_cup.runtime;

/**
 * This subclass of token represents symbols that need to maintain one
 * char value as an attribute.  It maintains that value in the public
 * field int_val.
 *
 * @author Scott Hudson
 * @version last updated: 1/7/96
 * @see com.sparrow.java_cup.runtime.str_token
 */

public class char_token extends token {

    /**
     * Full constructor.
     */
    public char_token(int term_num, char v) {
        /* super class does most of the work */
        super(term_num);

        char_val = v;
    }

    /**
     * Constructor with default value of 0
     */
    public char_token(int term_num) {
        this(term_num, '\0');
    }

    /**
     * The stored char value.
     */
    public char char_val;
};