/*
 * Copyright 2003-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package groovy.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;


/**
 * Represents an extent of objects
 *
 * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
 * @author <a href="mailto:ivan_ganza@yahoo.com">Ivan Ganza</a>
 * @version $Revision$
 * @author Chris Stevenson
 */
public interface GroovyResultSet extends GroovyObject, ResultSet {
    /**
     * Supports integer based subscript operators for accessing at numbered columns
     * starting at zero. Negative indices are supported, they will count from the last column backwards.
     *
     * @param index is the number of the column to look at starting at 1
     */
    public Object getAt(int index) throws SQLException;
    
    /**
     * Supports integer based subscript operators for updating the values of numbered columns
     * starting at zero. Negative indices are supported, they will count from the last column backwards.
     *
     * @param index is the number of the column to look at starting at 1
     */
    public void putAt(int index, Object newValue) throws SQLException;

    /**
     * Adds a new row to this result set
     *
     * @param values
     */
    public void add(Map values) throws SQLException;

    /**
     * Call the closure once for each row in the result set.
     *
     * @param closure
     * @throws SQLException
     */
    public void eachRow(Closure closure) throws SQLException;
    
}
