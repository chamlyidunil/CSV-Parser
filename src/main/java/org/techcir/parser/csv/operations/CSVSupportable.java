/*
 * ================================================================
 *  Copyright          : Chamly Rathnayaka
 * ================================================================
 */

package org.techcir.parser.csv.operations;

import org.techcir.parser.parser.ParserSupportable;

/**
 * This interface is supper class of CSV import/export supportable Classes.
 * Client need to implement this CSVSupportable to enable CSV import/export
 * @author chamly
 */
public interface CSVSupportable extends ParserSupportable{

    default void setParserError(String parserError) {

    }

    default String getParserError() {
        return "";
    }
}