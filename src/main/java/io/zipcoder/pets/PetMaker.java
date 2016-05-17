package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by nurudeenlawal on 5/7/16.
 */
public class PetMaker {
    User user = new User();
    int petsNum = user.findNumberofPets();

    String[] petNameArray = new String[petsNum];
    String[] petTypeArray = new String[petsNum];
    ArrayList<Pet> petList = new ArrayList<Pet>();

    public void petFill() {
        for (int i = 0; i < petsNum; i++) {
            petTypeArray[i] = user.petType();
            petNameArray[i] = user.pettName();
        }
    }

    public void printPet() {
        for (int i = 0; i < petsNum; i++) {

            /*System.out.println(petTypeArray[i] + ":" +petNameArray[i]);*/

                String choice = "Default";
                TypeofPet type = TypeofPet.valueOf(petTypeArray[i]);
                switch (type) {
                    case DOG:
                        petList.add(new Dog());
                        break;
                    case CAT:
                        petList.add(new Cat());
                        break;
                    case DRAGON:
                        petList.add(new Dragon());
                        break;
                    case TURTLE:
                        petList.add(new Turtle());
                        break;
                    case FISH:
                        petList.add(new Fish());
                        break;
                    default:
                        petList.add(new Pet());

                }
            }
        }
    }
