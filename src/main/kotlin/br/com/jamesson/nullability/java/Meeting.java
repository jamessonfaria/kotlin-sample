package br.com.jamesson.nullability.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Meeting {

    private String title;

    // ANOTACAO @NotNull DO JETBRAINS PARA PERMITIR O COMPILADOR IDENTIFICAR
    // PARAMETROS NULOS
    public void addTitle(@NotNull String title){
        this.title = title;
    }

    // ANOTACAO @Nullable DO JETBRAINS PARA PERMITIR O COMPILADOR IDENTIFICAR
    // NULOS DA CLASSE JAVA
    public @Nullable String meetingTitle(){
        return this.title;
    }

}
