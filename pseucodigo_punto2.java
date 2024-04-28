//PSEUCODIGO PUNTO 2 (MODELADO DE DOMINIO)

clase DestinoUnico{
    private Direccion origen;
    private Direccion destino;
+calcularTiempoAproximado(){
    tiempoAproximado = calculadorTiempoAproximado.calculadorTiempoAproximado(origen, destino)
    return tiempoAproximado;
}
}

clase DestinoMultiple{
    private Direccion origen;
    private List<Direccion> destinos;
+calcularTiempoAproximado(){
    tiempoAproximado += calculadorTiempoAproximado.calculadorTiempoAproximado(origen, destinos.fst())
    auxDestinos = destinos
    while (auxDestinos.scnd()!= null){
    tiempoAproximado += calculadorTiempoAproximado.calculadorTiempoAproximado(auxDestinos.fst(), auxDestinos.scnd())
    auxDestinos.remove(destinos.fst())
    }
    return tiempoAproximado;
}
}

clase DestinoMultipleConDetenciones{
    private Direccion origen;
    private List<Parada> paradas;
+calculadorTiempoAproximado(){
    tiempoAproximado += 
                        calculadorTiempoAproximado.calculadorTiempoAproximado(origen, paradas.fst().direccion()) 
                        + paradas.fst().cantMinutosDetenido()
    auxParadas = paradas

    while (auxParadas.scnd()!=null){
    tiempoAproximado += 
                        calculadorTiempoAproximado.calculadorTiempoAproximado(auxParadas.fst().direccion(), auxParadas.scnd.direccion())
                        + paradas.scnd().cantMinutosDetenido()

    auxParadas.remove(destinos.fst())
    }

}
}


