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
public class Button implements IRenderable {

    private IRenderer buttonRenderer;

    public Button() {
        this.buttonRenderer = new ButtonRenderer();
    }

    @Override
    public IRenderer getRenderer() {
        return buttonRenderer;
    }

    private class ButtonRenderer implements IRenderer {

        @Override
        public void render() {
            System.out.println("Button rendered");
        }

    }
}
