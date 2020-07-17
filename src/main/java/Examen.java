import java.util.List;
public class Examen {
    List<Pregunta> preguntas;
    List<CriterioCalculoNota> formulas;
    NotaAConsiderar notaAConsiderar; //irrelevante si solo hay un criterio
    int notaParaAprobar;

public int puntuacionMaxima(){
    return 20; // suma de todos los pesos
}
public int sumarPuntos(){
    return 10; //suma de los pesos de las preguntas bien contestadas
}

public int calcularNota(){
    return 10; //Calcular con todos los criterios y elegir el mas alto o sacar el promedio segun corresponda

    }


public boolean estaAprobado(){
   int nota =calcularNota();
    return  notaParaAprobar <= nota; //agregar mas condiciones para el punto 3
}

}
