grammar RulesNAlerts;

options {
  language = Java;
  //output = template;
  //backtrack=true;
}

fragment DIVIDE : '/';
fragment PLUS : '+';
fragment MINUS : '-';
fragment STAR : '*';
fragment MOD : '%';
LPAREN : '(';
RPAREN : ')';
fragment COMMA : ',';
fragment COLON : ':';
fragment LANGLEBRACKET : '<';
fragment RANGLEBRACKET : '>';
fragment EQ : '=';
fragment NOT : '!';
fragment UNDERSCORE : '_';
fragment DOT : '.';
fragment GRTRTHANEQTO : RANGLEBRACKET EQ;
fragment LESSTHANEQTO : LANGLEBRACKET EQ;
fragment NOTEQ       : NOT EQ;

WS       :           ('\t'|'\f'|'\n'|'\r'|' ')+{ $channel=HIDDEN; };

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');



//SECATTR   : ('a'..'z' | 'A'..'Z'|UNDERSCORE|DOT);

//New operators can be added as an when required
OP1   : ((C O U N T | A V G | C O U N T D I S T I N C T) 
      | C A S T) ;
      
OP2   : DIVIDE|PLUS|MINUS|STAR|MOD
      |LANGLEBRACKET|RANGLEBRACKET|EQ|GRTRTHANEQTO|LESSTHANEQTO|NOTEQ
      |E Q U A L S | L I K E | N O T E Q U A L S | N O T L I K E | N O T N U L L;
      
 OP3   : ((C O R R E S P O N D I N G | A N Y)|I);
OP4   : (A N D | O R);

 DIGIT    :    ('0'..'9')+;
Letter   : ('a'..'z' | 'A'..'Z')+;
 //Space    : ' '+;('a'..'z' | 'A'..'Z') UNDERSCORE? ('a'..'z' | 'A'..'Z'|' ')* DOT ('a'..'z' | 'A'..'Z'|' ') UNDERSCORE? ('a'..'z' | 'A'..'Z')*('a'..'z' | 'A'..'Z'|' ')* ;
fragment ISECATTR   :('a'..'z' | 'A'..'Z'|' ') UNDERSCORE? ('a'..'z' | 'A'..'Z'|' ')* DOT ('a'..'z' | 'A'..'Z'|' ') UNDERSCORE? ('a'..'z' | 'A'..'Z'|' ')* // ('a'..'z' | 'A'..'Z')+ DOT ('a'..'z' | 'A'..'Z')+
//          | ('a'..'z' | 'A'..'Z')+ (' ')+ ('a'..'z' | 'A'..'Z')+ DOT ('a'..'z' | 'A'..'Z')+ (' ')+ ('a'..'z' | 'A'..'Z')+
//          | ('a'..'z' | 'A'..'Z')+ (' ')+ ('a'..'z' | 'A'..'Z')+ UNDERSCORE ('a'..'z' | 'A'..'Z')+  DOT ('a'..'z' | 'A'..'Z')+ (' ')+ ('a'..'z' | 'A'..'Z')+ UNDERSCORE ('a'..'z' | 'A'..'Z')+
//          | ('a'..'z' | 'A'..'Z')+ (' ')+ ('a'..'z' | 'A'..'Z')+ UNDERSCORE ('a'..'z' | 'A'..'Z')+ (' ')+ ('a'..'z' | 'A'..'Z')+ DOT ('a'..'z' | 'A'..'Z')+ (' ')+ ('a'..'z' | 'A'..'Z')+ UNDERSCORE ('a'..'z' | 'A'..'Z')+ (' ')+ ('a'..'z' | 'A'..'Z')+
;
SECATTR : ISECATTR+
singlerule    : SECATTR  ;//OP2  (DIGIT|Letter)
//              | OP1  LPAREN  SECATTR  RPAREN  OP2  (DIGIT|Letter)
//              | SECATTR OP2 SECATTR
//              | OP1 LPAREN SECATTR RPAREN  OP2 OP1 LPAREN SECATTR RPAREN
//;
expr    :((LPAREN? singlerule RPAREN?) OP4?)+
        |((LPAREN (LPAREN singlerule RPAREN) OP4 (LPAREN singlerule RPAREN) RPAREN)+ (OP4 (LPAREN? singlerule RPAREN?))+ OP4?)+
        | (LPAREN (LPAREN singlerule RPAREN) OP4 (LPAREN singlerule RPAREN) RPAREN OP3)+;
