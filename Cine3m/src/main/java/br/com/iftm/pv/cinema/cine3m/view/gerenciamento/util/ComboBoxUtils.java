/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.util;

import java.util.List;
import javax.swing.JComboBox;

public class ComboBoxUtils {
    public static <T> void carregarComboBox(JComboBox<? super T> comboBox, List<T> itens) {
        comboBox.removeAllItems();

        for (T item : itens) {
            comboBox.addItem(item);
        }
    }

}
