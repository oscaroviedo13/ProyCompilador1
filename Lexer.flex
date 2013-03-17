package GUI;
import Lexico.Token;
import static Lexico.Token.*;
%%
%class Lexer
%type Token
L = [x-zX-Z_]
D = [0-9]
F = [0-9]+(\.[0-9][0-9]?)?
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"(" {return PAREN_I;}
")" {return PAREN_F;}
"^" {return EXPO;}
"=" {return ASSIGN;}
"+" {return SUMA;}
"*" {return MULT;}
"-" {return RESTA;}
"/" {return DIV;}
{L}({L}|{D})* {lexeme=yytext(); return VAR;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
 ("(-"{F}+")")|{F}+ {lexeme=yytext(); return FLOAT;}
. {return ERROR;}