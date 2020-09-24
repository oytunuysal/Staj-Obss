/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclassexample;

/**
 *
 * @author Oytun
 */
public class InnerClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Button button = new Button();
        Form form = new Form();

        RenderUtil renderUtil = new RenderUtil();
        renderUtil.doRender(button);
        renderUtil.doRender(form);
    }

}
