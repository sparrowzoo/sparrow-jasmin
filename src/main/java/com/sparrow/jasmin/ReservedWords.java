/* --- Copyright Jonathan Meyer 1996. All rights reserved. -----------------
 > File:        jasmin/src/jasmin/ReservedWords.java
 > Purpose:     Reserved words for Jasmin
 > Author:      Jonathan Meyer, 10 July 1996
 */

package com.sparrow.jasmin;

import java.util.Hashtable;

import com.sparrow.java_cup.runtime.token;

abstract class ReservedWords {
    static Hashtable reserved_words;

    public static token get(String name) {
    	return (token)reserved_words.get(name);
    }

    public static boolean contains(String name) {
    	return reserved_words.get(name) != null;
    }

    //
    // scanner initializer - sets up reserved_words table
    //
    static {
        reserved_words = new Hashtable();

        // Jasmin directives
        reserved_words.put(".catch", new token(SYM.DCATCH));
        reserved_words.put(".class", new token(SYM.DCLASS));
        reserved_words.put(".end", new token(SYM.DEND));
        reserved_words.put(".field", new token(SYM.DFIELD));
        reserved_words.put(".implements", new token(SYM.DIMPLEMENTS));
        reserved_words.put(".interface", new token(SYM.DINTERFACE));
        reserved_words.put(".limit", new token(SYM.DLIMIT));
        reserved_words.put(".line", new token(SYM.DLINE));
        reserved_words.put(".method", new token(SYM.DMETHOD));
        reserved_words.put(".set", new token(SYM.DSET));
        reserved_words.put(".source", new token(SYM.DSOURCE));
        reserved_words.put(".super", new token(SYM.DSUPER));
        reserved_words.put(".throws", new token(SYM.DTHROWS));
        reserved_words.put(".var", new token(SYM.DVAR));

        // reserved_words used in Jasmin directives
        reserved_words.put("from", new token(SYM.FROM));
        reserved_words.put("method", new token(SYM.METHOD));
        reserved_words.put("to", new token(SYM.TO));
        reserved_words.put("is", new token(SYM.IS));
        reserved_words.put("using", new token(SYM.USING));

        // Special-case instructions
        reserved_words.put("tableswitch", new token(SYM.TABLESWITCH));
        reserved_words.put("lookupswitch", new token(SYM.LOOKUPSWITCH));
        reserved_words.put("default", new token(SYM.DEFAULT));

        // Access flags
        reserved_words.put("public", new token(SYM.PUBLIC));
        reserved_words.put("private", new token(SYM.PRIVATE));
        reserved_words.put("protected", new token(SYM.PROTECTED));
        reserved_words.put("static", new token(SYM.STATIC));
        reserved_words.put("final", new token(SYM.FINAL));
        reserved_words.put("synchronized", new token(SYM.SYNCHRONIZED));
        reserved_words.put("volatile", new token(SYM.VOLATILE));
        reserved_words.put("transient", new token(SYM.TRANSIENT));
        reserved_words.put("native", new token(SYM.NATIVE));
        reserved_words.put("interface", new token(SYM.INTERFACE));
        reserved_words.put("abstract", new token(SYM.ABSTRACT));
    }
}
