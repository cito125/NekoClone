package nyc.c4q.helenchan.nekoclone.model;

import java.util.Calendar;

/**
 * Created by andresarango on 12/11/16.
 */

public class Chinchilla {
    private Long _id;
    private Long timeCreated;
    private String name;
    private String image_url;
    private int petCount;
    private Long mLastPet;

    public Chinchilla() {
        this.name = "Unknown";
        timeCreated = Calendar.getInstance().getTimeInMillis();
        image_url = "pendejo";
        petCount = 0;
        mLastPet = new Long(0);

    }

    public Chinchilla(String nombre){
        name = nombre;
    }

    public long getGetLastPet() {
        return mLastPet;
    }

    public int getPetCount() {
        return petCount;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getName() {
        return name;
    }
    //certain number of pets, something happens, x times
    //you get a new chinchilla, name is chinchilla{name}[son or daughter random]
    //check if chinchilla{name} ends in child, if true, when pet certain number of times
        //get chinchilla{name}grandchild
    //check if chinchilla{name} ends in grandchild, if true put chinchilla{name}great[numberOfTimes]child
    //don't pet, chinchilla{name} becomes a coat, Mila bought it
}
