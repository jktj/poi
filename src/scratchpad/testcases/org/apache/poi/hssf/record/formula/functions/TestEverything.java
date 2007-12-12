/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
/*
 * Created on May 11, 2005
 *
 */
package org.apache.poi.hssf.record.formula.functions;

import org.apache.poi.hssf.record.formula.eval.GenericFormulaTestCase;

import junit.framework.TestSuite;

/**
 * This is a test of all the normal formula functions we have implemented.
 * It should pick up newly implemented functions which are correctly added
 *  to the test formula excel file, but tweak the rows below if you
 *  add any past the end of what's currently checked.
 * For newly implemented eval functions, 
 *  @see org.apache.poi.hssf.record.formula.eval.TestEverything
 *
 * @author Amol S. Deshmukh &lt; amolweb at ya hoo dot com &gt;
 */
public class TestEverything extends TestSuite {
    public static TestSuite suite() throws Exception {
        TestSuite suite = new TestSuite("Tests for individual function classes");
        String s;
        for(int i=80; i<1485;i=i+4) {
        	s = "D"+Integer.toString(i).trim();
        	suite.addTest(new GenericFormulaTestCase(s));
        }
//        suite.addTest(new GenericFormulaTestCase("D1164"));
        return suite;
    }
}
