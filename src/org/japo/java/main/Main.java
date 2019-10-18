/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        //proceso
        try {
            // Rótulo
            System.out.println("Distancia entre Horas");
            System.out.println("=====================");

            //Hora inicio
            System.out.print("Hora inicio .....: ");
            int hEnt = SCN.nextInt();
            System.out.print("Minuto inicio .....: ");
            int mEnt = SCN.nextInt();
            System.out.print("Segundos inicio ...:");
            int sEnt = SCN.nextInt();
            //separador
            System.out.println("-----------");
            //Hora actual
            int hAct = cal.get(Calendar.HOUR_OF_DAY);
            int mAct = cal.get(Calendar.MINUTE);
            int sAct = cal.get(Calendar.SECOND);
            
            //tiempos
            int tiempoEnt = hEnt * 3600 + mEnt * 60 + sEnt;
            int tiempoAct = hAct * 3600 + mAct * 60 + sAct;
            
            //Segundos
             int Segundos = tiempoAct - tiempoEnt;
            
            //Minutos
             int Minutos = Segundos / 60;
            Segundos = Segundos % 60;
            
            //Horas
             int Horas = Minutos / 60;
            Minutos = Minutos % 60;
            
            // Salidas
            System.out.printf("Hora actual ......:  %02d/%02d/%02d%n", hAct, mAct, sAct);
            System.out.printf("Hora inicio ......: %02d/%02d/%02d%n", hEnt, mEnt, sEnt);
            System.out.printf("Tiempo de clase ..: %01d/%02d/%02d%n", Horas, Minutos, Segundos);
            
                   
        } catch (Exception e) {
            System.out.println("Error: Entrada incorrecta");
        }
    }
}
