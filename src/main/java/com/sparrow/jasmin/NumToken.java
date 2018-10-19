
package com.sparrow.jasmin;

import com.sparrow.java_cup.runtime.token;

/**
 * This subclass of token represents symbols that need to maintain one
 * number value as an attribute.  It maintains that value in the public
 * field num_val.
 *
 * @author Jon Meyer
 * @version last updated: 1/7/96
 * @see com.sparrow.java_cup.runtime.str_token
 */

class NumToken extends token {

    /**
     * Full constructor.
     */
    public NumToken(int term_num, Number v) {
        /* super class does most of the work */
        super(term_num);

        num_val = v;
    }

    /**
     * Constructor with default value of 0
     */
    public NumToken(int term_num) {
        this(term_num, new Integer(0));
    }

    /**
     * The stored number reference.
     */
    public Number num_val;
};
