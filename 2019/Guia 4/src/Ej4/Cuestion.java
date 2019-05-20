/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Fede
 */
class Cuestion {

    
    public static void main(String[] args) {
        A[] v = new A[10];
        for (int i = 0; i < 10; i++) {
            v[i] = new B();
            v[i].metodo();
        }
    }
}
/*
El constructo de A no es public
En B no tiene una llamada explicita al constructor de su clase padre
por lo tanto nunca se creara una instancia de este objeto
En Cuestion no se esta casteando para que el elemento pueda ver el metodo "metodo"
*/