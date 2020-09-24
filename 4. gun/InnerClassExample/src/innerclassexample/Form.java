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
public class Form implements IRenderable {

    private IRenderer formRenderer;

    public Form() {
        this.formRenderer = new FormRenderer();
    }

    @Override
    public IRenderer getRenderer() {
        return new FormRenderer();
    }

    private class FormRenderer implements IRenderer {

        @Override
        public void render() {
            System.out.println("Form rendered");
        }

    }

}
