/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.neilcsmith.praxis.live.laf;

import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicEditorPaneUI;

/**
 *
 * @author Neil C Smith (http://neilcsmith.net)
 */
public class HonorDisplayEditorPaneUI extends BasicEditorPaneUI {

    public static ComponentUI createUI(JComponent c) {
        c.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
        return new HonorDisplayEditorPaneUI();
    }
}
