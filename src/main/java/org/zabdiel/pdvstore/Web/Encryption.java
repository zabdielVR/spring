package org.zabdiel.pdvstore.Web;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encryption {

    public static void main(String []args){

        String password = "123";

        //pasword sin encriptacion
        System.out.println("Contraseña sin seguridad: " + password);

        //password con encriptacion

        System.out.println("Contraseña con encriptacion: "+ encryptPassword(password));


    }

    //Metodo que encripta la contraseña del usuario
    public static String encryptPassword(String password){
        //BCryptPasswordEncoder dependencia de Spring para realizar la encriptacion

        BCryptPasswordEncoder codificar = new BCryptPasswordEncoder();
        //@return codificar regresa el password con la contraseña encriptada
        return codificar.encode(password);
        //$2a$10$Ee8Y8SDcR/ODCcBJYOric.mG.uQtlSxgkkmqJiwPhcLEJFY.Tyo/.
    }

}
