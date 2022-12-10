public class Coches {
    

        public static void main(String[] args){
            Coche miCoche = new Coche();
            miCoche.agregopuerta();
            miCoche.agregopuerta();
            miCoche.agregopuerta();
            System.out.println(miCoche.puertas);
    
        }
    }
        class Coche {
            public int puertas = 0;
    
            public void agregopuerta(){
                this.puertas++;
            }
        }

