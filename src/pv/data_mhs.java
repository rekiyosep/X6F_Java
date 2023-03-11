/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv;

import javax.swing.*;

/**
 *
 * @author reki.pebriana
 */
public class data_mhs {

    public static void main(String[] args) {
        JFrame f = new JFrame("Form Data Mahasiswa");
        JLabel nm = new JLabel("Nama Masiswa");
        JLabel np = new JLabel("NPM");
        JLabel jk = new JLabel("Jenis Kelamin");
        JLabel sm = new JLabel("Semester");
        JLabel mk = new JLabel("Mata Kuliah");
        JTextField tNama = new JTextField();
        JTextField tNPM = new JTextField();
        JRadioButton rLaki = new JRadioButton("Laki-laki");
        JRadioButton rPerm = new JRadioButton("Perempuan");
        String[] list = {"1", "2", "3", "4", "5", "6", "7", "8"};
        JComboBox cSems = new JComboBox(list);
        JCheckBox pv = new JCheckBox("Pemrog. Visual");
        JCheckBox pb = new JCheckBox("PBO");
        JCheckBox pw = new JCheckBox("Pemrog. Web 2");
        JCheckBox kg = new JCheckBox("Komgraf");
        JButton bSave = new JButton("Save");
        JButton bAdd = new JButton("Add");
        JButton bCancel = new JButton("Cancel");
        JButton bExit = new JButton("Kaluar");
        

        nm.setBounds(30, 10, 100, 40);
        np.setBounds(30, 40, 100, 40);
        jk.setBounds(30, 70, 100, 40);
        sm.setBounds(30, 110, 100, 40);
        mk.setBounds(30, 140, 100, 40);
        tNama.setBounds(200, 10, 200, 20);
        tNPM.setBounds(200, 40, 200, 20);
        rLaki.setBounds(200, 70, 100, 40);
        rPerm.setBounds(310, 70, 100, 40);
        cSems.setBounds(200, 110, 100, 20);
        pv.setBounds(200, 140, 120, 40);
        pb.setBounds(340, 140, 120, 40);
        pw.setBounds(200, 170, 120, 40);
        kg.setBounds(340, 170, 120, 40);
        bSave.setBounds(30, 320, 90, 20);
        bAdd.setBounds(140, 320, 90, 20);
        bCancel.setBounds(250, 320, 90, 20);
        bExit.setBounds(370, 320, 90, 20);
        f.add(nm);
        f.add(np);
        f.add(jk);
        f.add(sm);
        f.add(mk);
        f.add(tNama);
        f.add(tNPM);
        f.add(rLaki);
        f.add(rPerm);
        f.add(cSems);
        f.add(pv);
        f.add(pb);
        f.add(pw);
        f.add(kg);
        f.add(bSave);
        f.add(bAdd);
        f.add(bCancel);
        f.add(bExit);
        f.setSize(500, 550);
        f.setLayout(null);
        f.setVisible(true);

    }

}
