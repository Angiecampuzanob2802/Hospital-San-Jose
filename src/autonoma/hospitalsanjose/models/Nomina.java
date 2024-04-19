/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package autonoma.hospitalsanjose.models;
    import java.util.Date;

    /**
     *La clase Nomina representa la información de la nómina de un empleado en el hospital San José.
     *Contiene el salario total, la fecha de emisión y un identificador único para la nómina.
     *@author Angie Campuzano Betancur & Brayan Estivel Díaz
     *@versión 1.0.0
     *@since 2024-04-08
     */
    public class Nomina {
        ////atributos////
        /**
         * El salario total registrado del empleado
         */
        private double salarioTotal;
        /**
         * Fecha de registro de la nomina
         */
        private Date fecha;
        /**
         * El identificado unico de la nomina
         */
        private String identificadorUnico;

        //// constructor con parametros ////
        /**
         * Constructor de la clase Nomina
         * @param salarioTotal El salario total registrado por empleado
         * @param fecha La fecha del registro de la nomina
         * @param identificadorUnico El identificador unico de la nomina 
         */
        public Nomina(double salarioTotal, Date fecha, String identificadorUnico) {
            this.salarioTotal = salarioTotal;
            this.fecha = fecha;
            this.identificadorUnico = identificadorUnico;
        }
        //////metodos de acceso///

        public double getSalarioTotal() {
            return salarioTotal;
        }

        public void setSalarioTotal(double salarioTotal) {
            this.salarioTotal = salarioTotal;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getIdentificadorUnico() {
            return identificadorUnico;
        }

        public void setIdentificadorUnico(String identificadorUnico) {
            this.identificadorUnico = identificadorUnico;
        }
    }
