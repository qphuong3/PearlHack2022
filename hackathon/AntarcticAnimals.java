import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.*;
import javafx.scene.layout.VBox;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.PathTransition;
import javafx.scene.shape.LineTo; 
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path;
import javafx.util.Duration; 
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.application.Application;
import javafx.scene.transform.Rotate;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import java.util.HashMap;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

// Sounds from https://dosits.org/galleries/audio-gallery/
// pictures of whales from http://killerwhalemuseum.com.au/information/whale-species/
// pictures of ocean https://hakaimagazine.com/news/midnight-sun-could-keep-predatory-fish-out-of-the-arctic/


public class AntarcticAnimals extends Application {

    @Override
    public void start(Stage stage) {
        Button blue = new Button();
        Button fin = new Button();
        Button hump = new Button();
        Button minke = new Button();
        Button orca = new Button();
        Button sei = new Button();
        Button sperm = new Button();
        Button south = new Button();
        StackPane sb = new StackPane();
        ImageView iv1 = new ImageView(new Image("header-light-barrier.jpeg"));
        iv1.setFitHeight(600);
        iv1.setPreserveRatio(true);
        sb.getChildren().addAll(iv1, blue, fin, hump, minke, orca, sei, sperm, south);
        HashMap<String, HashMap <String, String>> info = new HashMap();
        HashMap <String, String> conservationStatus = new HashMap();
        HashMap <String, String> scientificName = new HashMap();
        HashMap <String, String> diet = new HashMap();
        HashMap <String, String> size = new HashMap();
        HashMap <String, String> interestingFact = new HashMap();
        HashMap <String, String> lifeSpan = new HashMap();

        conservationStatus.put("Blue Whale", "endangered (Population: 10-25 thousand))");
        scientificName.put("Blue Whale", "Balaenoptera musculus");
        diet.put("Blue Whale", "up to four tons of krill");
        size.put("Blue Whale", "25-30 meters\n100-160 tons");
        interestingFact.put("Blue Whale", "the mouth of a Blue whale has enough space for about 100 people");
        lifeSpan.put("Blue Whale", "30-80 years");


        conservationStatus.put("Fin Whale", "endangered (Population: 100,000)");
        scientificName.put("Fin Whale", "Balaenoptera physalus");
        diet.put("Fin Whale", "plankton-sized animals including fish, crustaceans, and squid");
        size.put("Fin Whale", "6.5-24 meters\n1.8-7 tons");
        interestingFact.put("Fin Whale", "can scoop up as much as 10 kg per gulp");
        lifeSpan.put("Fin Whale", "80-90 years");


        conservationStatus.put("Humpback Whale", "least concern (Population: 60,000)");
        scientificName.put("Humpback Whale", "Megaptera novaeangliae");
        diet.put("Humpback Whale", "krill and school fish (haddock, herring, capelin, salmon, sand lance, pollock, and mackerel)\nfeed mostly during summer, living off their fat during winter");
        size.put("Humpback Whale", "6.5-24 meters\n25-30 tons");
        interestingFact.put("Humpback Whale", "Calves can drink up to 600 liters of milk in a day");
        lifeSpan.put("Humpback Whale", "100 years");

        conservationStatus.put("Minke Whale", "data deficient (Population: 515,000)");
        scientificName.put("Minke Whale", "Balaenoptera bonaerensis");
        diet.put("Minke Whale", "crustaceans, plankton, and small schooling fish");
        size.put("Minke Whale", "9.8-10.7 meters\n5.8-9 tons");
        interestingFact.put("Minke Whale", "vocalizations of minke whales can be up to 152 decibels, as loud as the noise of jet planes taking off");
        lifeSpan.put("Minke Whale", "80-90 years");


        conservationStatus.put("Orca", "Data deficient (Population: 50,000)");
        scientificName.put("Orca", "Orcinus orca");
        diet.put("Orca", "seals, smaller whales and dolphins, sea lions, different fish, sharks, squid, octopi, sea birds, sea turtles, sea otters, and river otters.");
        size.put("Orca", "6-9 meters\n3-6 tons");
        interestingFact.put("Orca", "When orcas are born, they have a flexible dorsal fin, which stiffens as they grow older");
        lifeSpan.put("Orca", "30-100 years");

        conservationStatus.put("Sei Whale", "Endangered (Population: 80,000)");
        scientificName.put("Sei Whale", "Balaenoptera borealis");
        diet.put("Sei Whale", "pfish, squid, and plankton");
        size.put("Sei Whale", "14-16 meters\n20-25 tons");
        interestingFact.put("Sei Whale", "can consume up to 2,000 pounds of food each day");
        lifeSpan.put("Sei Whale", "50-75 years");

        conservationStatus.put("Sperm Whale", "Vulnerable (Population: 100-360 thousand)");
        scientificName.put("Sperm Whale", "Physeter macrocephalus");
        diet.put("Sperm Whale", "plankton-sized animals including fish, crustaceans, and squid");
        size.put("Sperm Whale", "11-18 meters\n12-40.8 tons");
        interestingFact.put("Sperm Whale", "largest brain of any animal on Earth");
        lifeSpan.put("Sperm Whale", "80-90 years");

        conservationStatus.put("Southern Right Whale", "least concerns (Population: 7,500)");
        scientificName.put("Southern Right Whale", "Eubalaena australis");
        diet.put("Southern Right Whale", "pcopepods and pteropods");
        size.put("Southern Right Whale", "12.5-15.5 meters\n60 tons");
        interestingFact.put("Southern Right Whale", "do not cross the equator into the northern hemisphere because will overheat");
        lifeSpan.put("Southern Right Whale", "50-100 years");

        info.put("Conservation Status", conservationStatus);
        info.put("Scientific Name", scientificName);
        info.put("Diet", diet);
        info.put("Size", size);
        info.put("Interesting Fact", interestingFact);
        info.put("Life Span", lifeSpan);
        

        makeButton("Blue Whale", "blue-whale.mp3", "BLUE_WHALE.png", blue, 200, info);
        makePath(blue, 600.0f, -66.0f, -350.0f, -66.0f, 10);
        makeButton("Fin Whale", "fin-whales.mp3", "FIN_WHALE.png", fin, 120, info);
        makePath(fin, 600.0f, -30.0f, -350.0f, -30.0f, 16);
        makeButton("Orca", "Killer_Whales.mp3", "ORCA.png", orca, 64, info);
        makePath(orca, 600.0f, -66.0f, -350.0f, 50.0f, 3);
        makeButton("Sei Whale", "Sei_Whale.mp3", "SEI_WHALE.png", sei, 120, info);
        makePath(sei, 600.0f, 6.0f, -350.0f, 6.0f, 3);


        makeButton("Humpback Whale", "Humpback.mp3", "humpback.png", hump, 120, info);
        makePath(hump, -350.0f, -30.0f, 600.0f, -30.0f, 18);
        makeButton("Minke Whale", "Minke_Whale.mp3", "minke.png", minke, 80, info);
        makePath(minke, -350.0f, 10.0f, 600.0f, 10.0f, 8);
        makeButton("Sperm Whale", "Sperm_Whale.mp3", "sperm.png", sperm, 120, info);
        makePath(sperm, -350.0f, 200.0f, 600.0f, 200.0f, 22);
        makeButton("Southern Right Whale", "SRW.mp3", "Southern.png", south, 100, info);
        makePath(south, -350.0f, -60.0f, 600.0f, -60.0f, 20);


        Scene scene = new Scene(sb, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public void makeButton(String name, String sound, String img, Button b, int s, HashMap<String, HashMap<String, String>> info) {
        b.setStyle("-fx-background-color: transparent");
        ImageView view = new ImageView(new Image(img));
        b.setGraphic(view);
        view.setFitWidth(s);
        view.setPreserveRatio(true);
        
        String infoArr[] = {"Scientific Name", "Conservation Status", "Diet", "Size", "Life Span", "Interesting Fact" };
        ChoiceDialog d = new ChoiceDialog(null, infoArr);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                String musicFile = sound; 
                Media sound = new Media(new File(musicFile).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(sound);
                mediaPlayer.play();
                d.setTitle(name);
                // setheader text
                d.setHeaderText(name);
                // set content text
                d.setContentText("More Information");
                // show the dialog
                Optional<String> result = d.showAndWait();
                if (result.isPresent()) {
                    Dialog<String> dialog = new Dialog<>();
                    dialog.setTitle(result.get());
                    ButtonType type = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
                    dialog.getDialogPane().getButtonTypes().add(type);
                    dialog.setContentText(info.get(result.get()).get(name));
                    dialog.showAndWait();
                }
            }
        };
        b.setOnAction(event);
    }
    public void makePath (Button b, float startX, float startY, float endX, float endY, double seconds) {
        Path path = new Path();
        path.getElements().add(new MoveTo(startX, startY));
        path.getElements().add(new LineTo(endX, endY));
        PathTransition pathTransition = new PathTransition(); 
        pathTransition.setNode(b); 
        pathTransition.setCycleCount(Animation.INDEFINITE); 
        pathTransition.setAutoReverse(false); 
        pathTransition.setPath(path); 
        pathTransition.setDuration(Duration.millis(seconds * 1000));
        pathTransition.play();
    }

    public static void main(String[] args) {
        launch();
    }

}