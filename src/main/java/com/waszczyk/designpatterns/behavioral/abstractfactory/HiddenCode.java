package com.waszczyk.designpatterns.behavioral.abstractfactory;

public class HiddenCode {
	 
    private enum Table {
        A("\u0066"),
        Q("\u0075"),
        U("\u0074"),
        E("\u0075"),
        S("\u0072"),
        T("\u0065");
 
        private String value;
 
        private Table(String value) {
            this.value = value;
        }
 
        public String toString() {
            return this.value;
        }
    }
 
    public static void main(String[] args) {
        String str = Table.A.toString() + Table.Q.toString() 
                + Table.U.toString() + Table.E.toString()
                + Table.S.toString() + Table.T.toString();
        System.out.print(str);
    }
 
}
