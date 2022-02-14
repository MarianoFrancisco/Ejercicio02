package com.mycompany.ejercicio02;
import java.util.ArrayList;//importamos array
%%
/*configuramos nuestro jflex*/
%class codigoVocalesNumeros 
%unicode
%line
%column
%int
%public
//indicamos expresiones regulares en clase
espacio=[\t|\r|\n|\f|" "|""]+
D=[0-9]
L=[a-zA-Z]
C=[bcdfghjklmnñpqrstvxzwyBCDFGHJKLMNÑPQRSTVXZWY0-9]
V=[aeiouAEIOU]
%{
    /*metodos*/
    //creamos variables
    private int detector=0,contador1Vocal = 0,contador2Vocal = 0,contador3Vocal = 0,contador4Vocal = 0,contador5Vocal = 0;
    //creamos arraylist y su metodo para almacenar valores de enteros
    private ArrayList<String> almacenamientoNumeros= new ArrayList<String>();
    private void seleccionarNumeros(String textoNumero, int columnas, int fila) {
        char chars='a';
        //recorremos posiciones para detectar si el texto tiene un numero, en caso que si agregamos a arraylist
        for (int i = 0; i < textoNumero.length(); i++) {
                chars=textoNumero.charAt(i);
                if(Character.isDigit(chars)){
                    almacenamientoNumeros.add("Entero "+chars+" detectado en Fila: "+fila+", Columna: "+ columnas);
                }
                columnas=columnas+1;            
        }
    } 
    public ArrayList<String> getNumerosEncontrados(){
        return almacenamientoNumeros;
    }
    //Deteccion de errores
    private void detectarError(){
        detector=1;
    }
    public int getError() {
        return detector;
    }
    //1 vocal
    private void incrementarContador1() {
        contador1Vocal++;
    }
    
    public int getIncrementarContador1() {
        return contador1Vocal;
    }
    //2 vocales
    private void incrementarContador2() {
        contador2Vocal++;
    }
    
    public int getIncrementarContador2() {
        return contador2Vocal;
    }
    //3 vocales
    private void incrementarContador3() {
        contador3Vocal++;
    }
    
    public int getIncrementarContador3() {
        return contador3Vocal;
    }
    //4 vocales
    private void incrementarContador4() {
        contador4Vocal++;
    }
    
    public int getIncrementarContador4() {
        return contador4Vocal;
    }
    //5 vocales
    private void incrementarContador5() {
        contador5Vocal++;
    }
    
    public int getIncrementarContador5() {
        return contador5Vocal;
    }
%}

%%
//detector vocales y numeros
<YYINITIAL> {C}*{V}{C}*   { incrementarContador1(); seleccionarNumeros(yytext(), (yycolumn+1), (yyline+1));}
<YYINITIAL> {C}*{V}{C}*{V}{C}*     { incrementarContador2(); seleccionarNumeros(yytext(), (yycolumn+1), (yyline+1));}
<YYINITIAL> {C}*{V}{C}*{V}{C}*{V}{C}*     { incrementarContador3(); seleccionarNumeros(yytext(), (yycolumn+1), (yyline+1));}
<YYINITIAL> {C}*{V}{C}*{V}{C}*{V}{C}*{V}{C}*    { incrementarContador4(); seleccionarNumeros(yytext(), (yycolumn+1), (yyline+1));}
<YYINITIAL> {C}*{V}{C}*{V}{C}*{V}{C}*{V}{C}*{V}{C}*   { incrementarContador5(); seleccionarNumeros(yytext(), (yycolumn+1), (yyline+1));}
//detector digitos solitarios
<YYINITIAL> {D} {almacenamientoNumeros.add("Entero "+yytext()+" detectado en Fila: "+(yyline+1)+", Columna: "+ (yycolumn+1));}
//casos contrarios que cumplan con el abecedario
<YYINITIAL> ({D}|{L})*{V}({D}|{L})*{V}({D}|{L})*{V}({D}|{L})*{V}({D}|{L})*{V}({D}|{L})*{V}({D}|{L})*   { seleccionarNumeros(yytext(), (yycolumn+1), (yyline+1));}
<YYINITIAL> {C}*   { seleccionarNumeros(yytext(), (yycolumn+1), (yyline+1));}
{espacio}* {/*No pasa nada*/}
//caso para encontrar errores
[^] {detectarError();}