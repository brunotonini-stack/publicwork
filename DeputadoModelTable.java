
package Deputados;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.javafx.scene.control.skin.Utils;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DeputadoModelTable extends AbstractTableModel {
    
    Gson gson = new Gson();
    
    String data = "[{\n" +
"		\"id\": 0,\n" +
"		\"nome\": \"ABÍLIO SANTANA\",\n" +
"		\"siglaPartido\": \"PL\",\n" +
"		\"siflaUf\": \"BA\",\n" +
"		\"urlFoto\": \"https://www.camara.leg.br/internet/deputado/bandep/204554.jpg\",\n" +
"		\"email\": \"dep.abiliosantana@camara.leg.br\"\n" +
"	},\n" +
"	{\n" +
"		\"id\": 1,\n" +
"		\"nome\": \"ABOU ANNI\",\n" +
"		\"siglaPartido\": \"PSL\",\n" +
"		\"siflaUf\": \"SP\",\n" +
"		\"urlFoto\": \"https://www.camara.leg.br/internet/deputado/bandep/204521.jpg\",\n" +
"		\"email\": \"dep.abouanni@camara.leg.br\"\n" +
"	},\n" +
"	{\n" +
"		\"id\": 2,\n" +
"		\"nome\": \"AÉCIO NEVES\",\n" +
"		\"siglaPartido\": \"PSDB\",\n" +
"		\"siflaUf\": \"MG\",\n" +
"		\"urlFoto\": \"https://www.camara.leg.br/internet/deputado/bandep/74646.jpg\",\n" +
"		\"email\": \"dep.aecioneves@camara.leg.br\"\n" +
"	},\n" +
"	{\n" +
"		\"id\": 3,\n" +
"		\"nome\": \"CARLA ZAMBELLI\",\n" +
"		\"siglaPartido\": \"PSL\",\n" +
"		\"siflaUf\": \"SP\",\n" +
"		\"urlFoto\": \"https://www.camara.leg.br/internet/deputado/bandep/204507.jpg\",\n" +
"		\"email\": \"dep.carlazambelli@camara.leg.br\"\n" +
"	},\n" +
"	{\n" +
"		\"id\": 4,\n" +
"		\"nome\": \"DARCI DE MATOS\",\n" +
"		\"siglaPartido\": \"PSD\",\n" +
"		\"siflaUf\": \"SC\",\n" +
"		\"urlFoto\": \"https://www.camara.leg.br/internet/deputado/bandep/116379.jpg\",\n" +
"		\"email\": \"dep.darcidematos@camara.leg.br\"\n" +
"	}\n" +
"]";
    
    List<Deputado> deputado = gson.fromJson(data,new TypeToken<List<Deputado>>(){}.getType());
    private String[] colunas =  {"ID","Nome", "Partido","UF","E-mail","Foto"};
    
   public void adicionar(Deputado d){
       this.deputado.add(d);
       this.fireTableDataChanged();
   }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return deputado.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna) {
		case 0:
			deputado.get(linha).getId();
		case 1:
			deputado.get(linha).getNome();
		case 2:
			deputado.get(linha).getSiglaPartido();
		case 3:
			deputado.get(linha).getSiglaUf();
		case 4:
			deputado.get(linha).getEmail();
		case 5:
			deputado.get(linha).getUrlFoto();
			
		}
	
		return null;
    }
    
}
