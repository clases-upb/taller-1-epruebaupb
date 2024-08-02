package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
        System.out.println(Convertir_km_seg(40));
        System.out.println(Convertir_cm_lt(3500));
        System.out.println(Convertir_us_cops(45623));
        System.out.println(Convertir_cent_far(0));
        System.out.println(Calcular_segs((short)1, (short)1, (short)1, (short)1));
        System.out.println(Calcular_peso_carga((float)47.5, (float) 7.5));
        System.out.println(Calcular_horasxviaje("Armenia", (short)285, (short)72));
        System.out.println(Calcular_combustible(638, 312, 1243, 220));
        System.out.println(Calcular_peso_luna((byte)80));
    }

    
    public static String Convertir_km_seg(int vel_km_seg){

        try{
            final short mtxkm = 1000, segxhr=3600;
            float mt_seg = 0, mt_hor = 0;
            String txt_return="";

            mt_seg = vel_km_seg*mtxkm;
            mt_hor = segxhr*mt_seg;

            txt_return += mt_seg + " m/s - " + mt_hor + " m/h";

            return txt_return;
        }
        catch(Exception e){
            return ("Error en la conversion");

        }

    }

  
    public static float Convertir_cm_lt (double cant_cc){

        try {
            final short cmxlt = 1000;
            float tot_litros = (float)(cant_cc/cmxlt);
            return tot_litros;
        } 
        
        catch (Exception e) {
            return 0;
        }

    }

  
   
    public static long Convertir_us_cops(long monto_us){
    try {
        final short trm = 4170;
        long tot_cops = monto_us * trm;
        return tot_cops;

    } catch (Exception e) {
            return -1;
    }
   }
  
   

    public static float Convertir_cent_far(float temp_grad_cent){

        try {
            
            float gra_far = 32 + ( 9 * temp_grad_cent / 5);
            return gra_far;


        } catch (Exception e) {
            return -1;
        }

    }        

   

   public static int Calcular_segs(short dd, short hh, short mm, short ss){
        try {
            final int ssxd = 86400, ssxh = 3600, ssxm = 60;
            int total_segs; 
            
            if(dd >=0 && hh>=0 && mm >=0 && ss >=0) 
                total_segs = dd*ssxd + hh*ssxh + mm * ssxm + ss;
            else
                total_segs = -1;

            return total_segs;

        } catch (Exception e) {
            return -1;
        }
    }


   public static String Calcular_peso_carga(float peso_cargado, float peso_vacio) {
        try {
            String mensaje = "";
            final short kiloxton = 1000;
            float peso_neto_ton = 0, peso_neto_kil = 0;

            peso_neto_ton = peso_cargado - peso_vacio;
            peso_neto_kil = peso_neto_ton*kiloxton;

            return peso_neto_kil + " kilos - " + peso_neto_ton + " toneladas";
        } 
        
        catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
        }
   }


   public static float Calcular_horasxviaje (String destino, short distancia_km, short velocidad_kmxh){

        try {
            float horas_destino = 0;
            horas_destino = distancia_km/velocidad_kmxh;
            return horas_destino;
        } 
        
        catch (Exception e) {
            return -1;
        }

   }    
   

   public static float Calcular_combustible(int km_r1, int km_r2, int km_r3, int km_r4){

        try {
            final float consumoDespegue = 1.2f, consumoAterrizaje = 0.4f, consumoPorKm = (float)(0.2 / 60.8);
            float consumo_total_comb=0, cons_r1_comb=0, cons_r2_comb=0, cons_r3_comb=0, cons_r4_comb=0;

            cons_r1_comb = km_r1*consumoPorKm + consumoDespegue + consumoAterrizaje;
            cons_r2_comb = km_r2*consumoPorKm + consumoDespegue + consumoAterrizaje;
            cons_r3_comb = km_r3*consumoPorKm + consumoDespegue + consumoAterrizaje;
            cons_r4_comb = km_r4*consumoPorKm + consumoDespegue + consumoAterrizaje;

            consumo_total_comb = cons_r1_comb+cons_r2_comb+cons_r3_comb+cons_r4_comb;
            
            return consumo_total_comb;

        } 
        catch (Exception e) {
            return -1;
        }
   }
   
   
   
   public static double Calcular_peso_luna(byte peso_kl){

        try {
            final float factor_tierra = 9.81f, factor_luna = 0.165f;

            double peso_tierra_new = 0, peso_luna_new = 0; 

            peso_tierra_new = peso_kl * factor_tierra;

            peso_luna_new = peso_tierra_new*factor_luna;

            return peso_luna_new;


        } 
        
        catch (Exception e) {
           return 0;
        }

   }

}
