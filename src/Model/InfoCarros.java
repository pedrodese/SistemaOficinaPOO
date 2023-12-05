package Model;

import java.util.ArrayList;

public class InfoCarros {
    private final ArrayList<Carro> carrosFabricados = new ArrayList<>();

    public ArrayList<Carro> getCarrosFabricados(){
        return carrosFabricados;
    }

    public void setCarrosFabricados(Carro carrosFabricados){
        this.carrosFabricados.add(carrosFabricados);
    }


}
