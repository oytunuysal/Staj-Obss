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
public class RenderUtil {

    public void doRender(IRenderable renderable) {
        renderable.getRenderer().render();
    }
}
