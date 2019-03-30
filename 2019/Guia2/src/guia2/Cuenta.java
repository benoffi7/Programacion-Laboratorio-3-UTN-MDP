/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

/**
 *
 * @author negro
 */
public class Cuenta 
{
   
        private static float saldo;
        private static int id;

        public Cuenta()
        {
            saldo = 0;
            setId();
        }

        public Cuenta(float SaldoInicial)
        {
            setSaldo(SaldoInicial);
            setId(); 
        }


        public float getSaldo()
        {
            return saldo;
        }

        private void setSaldo(float saldoR)
        {   
            saldo = saldoR;
        }
        
        private void setId()
        {
            id = 1;
        }
        

        public void Ingresar(float monto)
        {
            saldo = saldo + monto;
        }

        public boolean Extraer (float monto)
        {
            boolean flag = true;
            
            if(ComprobarSaldo(monto))
            {
                saldo = saldo - monto;
            }
            else
            {
                flag = false;
            }
            return flag;
        }

        public boolean ComprobarSaldo(float monto)
        {
            if(monto<=getSaldo())
            {
                return true;
            }  
            else
            {
                return false;
            }
        }
        
}

