Calculator.java
LOC = 188

Statička analiza:
warnings:
1. 'for' loop can be replaced with enhanced 'for': 53
2. Local variable 'textResult' is redundant : 70
3. Can be replaced with 'getFirst()' call : 77
4. 'return' is unnecessary as the last statement in a 'void' method : 183
weak warnings:
1. It's possible to extract method returning 'operationList' from a long surrounding method :39
2. Common part can be extracted from 'if': 87
3. Common part can be extracted from 'if': 138

Start.java
LOC = 26

Statička analiza:
warnings:
1. Replace this use of System.out by a logger: 8
2. Replace this use of System.out by a logger: 19
weak warnings:
1. Rename this method name to match the regular expresion '^[a-z][a-zA-Z0-9]*$ :6 
