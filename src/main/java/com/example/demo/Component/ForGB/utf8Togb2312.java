package com.example.demo.Component.ForGB;

public class utf8Togb2312 {
    public static String utf8Togb2312(String str){

        StringBuffer sb = new StringBuffer();

        for ( int i=0; i<str.length(); i++) {

            char c = str.charAt(i);

            switch (c) {

                case '+' :

                    sb.append( ' ' );

                    break ;

                case '%' :

                    try {

                        sb.append(( char )Integer.parseInt (

                                str.substring(i+1,i+3),16));

                    }

                    catch (NumberFormatException e) {

                        throw new IllegalArgumentException();

                    }

                    i += 2;

                    break ;

                default :

                    sb.append(c);

                    break ;

            }

        }

        String result = sb.toString();

        String res= null ;

        try {

            byte [] inputBytes = result.getBytes( "8859_1" );

            res= new String(inputBytes, "UTF-8" );

        }

        catch (Exception e){}

        return res;

    }
}
