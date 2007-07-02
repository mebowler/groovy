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
package org.codehaus.groovy.runtime.typehandling;

/**
 * Long NumberMath operations
 * 
 * @author Steve Goetze
 */
public class LongMath extends NumberMath {

	protected static LongMath instance = new LongMath();

	private LongMath() {}
					
	protected Number absImpl(Number number) {
		return new Long(Math.abs(number.longValue()));
	}
	
	protected Number addImpl(Number left, Number right) {
		return new Long(left.longValue() + right.longValue());
	}

	protected Number subtractImpl(Number left, Number right) {
		return new Long(left.longValue() - right.longValue());
	}

	protected Number multiplyImpl(Number left, Number right) {
		return new Long(left.longValue() * right.longValue());
	}

	protected Number divideImpl(Number left, Number right) {
		return BigDecimalMath.instance.divideImpl(left, right);
	}
	
	protected int compareToImpl(Number left, Number right) {
		long leftVal = left.longValue();
		long rightVal = right.longValue();
		return (leftVal<rightVal ? -1 : (leftVal==rightVal ? 0 : 1));
	}

	protected Number intdivImpl(Number left, Number right) {
        return new Long(left.longValue() / right.longValue());
	}
	
    protected Number modImpl(Number left, Number right) {
        return new Long(left.longValue() % right.longValue());
    }
    
    protected Number negateImpl(Number left) {
        return new Long(-left.longValue());
    }
    
    protected Number bitNegateImpl(Number left) {
        return new Long(~left.longValue());
    }
    
    protected Number orImpl(Number left, Number right) {
        return new Long(left.longValue() | right.longValue());
    }

    protected Number andImpl(Number left, Number right) {
        return new Long(left.longValue() & right.longValue());
    }
    
    protected Number xorImpl(Number left, Number right) {
        return new Long(left.longValue() ^ right.longValue());
    }
    
    protected Number leftShiftImpl(Number left, Number right) {
        return new Long(left.longValue() << right.longValue());
    }

    protected Number rightShiftImpl(Number left, Number right) {
        return new Long(left.longValue() >> right.longValue());
    }

    protected Number rightShiftUnsignedImpl(Number left, Number right) {
        return new Long(left.longValue() >>> right.longValue());
    }

    protected Number bitAndImpl(Number left, Number right) {
        return new Long(left.longValue() & right.longValue());
    }
}
