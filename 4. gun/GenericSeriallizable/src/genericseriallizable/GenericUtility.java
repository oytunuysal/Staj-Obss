/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericseriallizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Oytun
 */
public class GenericUtility<T extends Serializable> {
    //public <T extends Serializable> void serializeObject(FileOutputStream file, List<T> list)

    public void serializeObject(FileOutputStream file, List<T> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(file);) {
            for (T object : list) {
                oos.writeObject(object);
            }
        } catch (Exception e) {

            System.err.println(e);
        }
    }

    public T deserialize(FileInputStream file) {
        try (ObjectInputStream ois = new ObjectInputStream(file);) {
            return (T) ois.readObject();
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }
}
