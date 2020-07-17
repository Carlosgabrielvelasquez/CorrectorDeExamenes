public class VerdaroFalso implements Pregunta {
    String pregunta;
    int peso;
    boolean respuestaCorrecta;
    boolean respuestaEstudiante;

    public int getPeso() {
        return peso;
    }

    public boolean bienRespondida() {
        return respuestaEstudiante==respuestaCorrecta;
    }
    public void responder(boolean respuesta) {
        respuestaEstudiante = respuesta;
    }


}