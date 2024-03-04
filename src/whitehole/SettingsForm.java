/*
 * Copyright (C) 2022 Whitehole Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package whitehole;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import whitehole.io.FilesystemBase;

public class SettingsForm extends javax.swing.JDialog {
    public SettingsForm(JFrame parent) {
        super(parent, true);
        
        initComponents();
        
        ((KeybindButton)btnPosition).setKeyBind(Settings.getKeyPosition());
        ((KeybindButton)btnRotation).setKeyBind(Settings.getKeyRotation());
        ((KeybindButton)btnScale).setKeyBind(Settings.getKeyScale());
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content
     * of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlSettings = new javax.swing.JPanel();
        pnlAppearance = new javax.swing.JPanel();
        chkDebugAdditionalLogs = new javax.swing.JCheckBox();
        lblAppearance = new javax.swing.JLabel();
        chkUseDarkMode = new javax.swing.JCheckBox();
        chkUseBetterQuality = new javax.swing.JCheckBox();
        chkDebugFakeColor = new javax.swing.JCheckBox();
        chkDebugFastDrag = new javax.swing.JCheckBox();
        pnlAreaColors = new javax.swing.JPanel();
        lblAreaColors = new javax.swing.JLabel();
        lblNormalAreaColor = new javax.swing.JLabel();
        btnNormalAreaPrimaryColor = new javax.swing.JButton();
        btnNormalAreaSecondaryColor = new javax.swing.JButton();
        lblCameraAreaColor = new javax.swing.JLabel();
        btnCameraAreaPrimaryColor = new javax.swing.JButton();
        btnCameraAreaSecondaryColor = new javax.swing.JButton();
        lblGravityAreaColor = new javax.swing.JLabel();
        btnGravityAreaPrimaryColor = new javax.swing.JButton();
        btnGravityAreaSecondaryColor = new javax.swing.JButton();
        pnlControls = new javax.swing.JPanel();
        lblControls = new javax.swing.JLabel();
        chkUseReverseRot = new javax.swing.JCheckBox();
        chkUseWASD = new javax.swing.JCheckBox();
        btnPosition = new KeybindButton();
        lblPosition = new javax.swing.JLabel();
        lblRotation = new javax.swing.JLabel();
        btnRotation = new KeybindButton();
        btnScale = new KeybindButton();
        lblScale = new javax.swing.JLabel();
        pnlMisc = new javax.swing.JPanel();
        lblBaseGame = new javax.swing.JLabel();
        lblMisc = new javax.swing.JLabel();
        txtBaseGame = new javax.swing.JTextField();
        btnBrowseBaseGamePath = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(String.format("%s -- Settings", Whitehole.NAME));
        setBounds(new java.awt.Rectangle(0, 0, 629, 629));
        setIconImage(Whitehole.ICON);
        setMinimumSize(new java.awt.Dimension(689, 338));
        setPreferredSize(new java.awt.Dimension(689, 338));
        setSize(new java.awt.Dimension(689, 338));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlSettings.setMaximumSize(new java.awt.Dimension(689, 338));
        pnlSettings.setMinimumSize(new java.awt.Dimension(689, 338));
        pnlSettings.setPreferredSize(new java.awt.Dimension(689, 338));
        java.awt.GridBagLayout pnlSettingsLayout = new java.awt.GridBagLayout();
        pnlSettingsLayout.columnWeights = new double[] {1.0, 1.0, 1.0, 1.0};
        pnlSettings.setLayout(pnlSettingsLayout);

        pnlAppearance.setMinimumSize(new java.awt.Dimension(483, 274));
        pnlAppearance.setPreferredSize(new java.awt.Dimension(483, 274));
        pnlAppearance.setLayout(new java.awt.GridBagLayout());

        chkDebugAdditionalLogs.setSelected(Settings.getDebugAdditionalLogs());
        chkDebugAdditionalLogs.setText("[Debug] Print additional debug logs");
        chkDebugAdditionalLogs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkDebugAdditionalLogsItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlAppearance.add(chkDebugAdditionalLogs, gridBagConstraints);

        lblAppearance.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAppearance.setText("Appearance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlAppearance.add(lblAppearance, gridBagConstraints);

        chkUseDarkMode.setSelected(Settings.getUseDarkMode());
        chkUseDarkMode.setText("Use Dark Mode");
        chkUseDarkMode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkUseDarkModeItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlAppearance.add(chkUseDarkMode, gridBagConstraints);

        chkUseBetterQuality.setSelected(Settings.getUseBetterQuality());
        chkUseBetterQuality.setText("Better Quality (Requires closing whitehole)");
        chkUseBetterQuality.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkUseBetterQualityItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlAppearance.add(chkUseBetterQuality, gridBagConstraints);

        chkDebugFakeColor.setSelected(Settings.getDebugFakeColor());
        chkDebugFakeColor.setText("[Debug] Render picking colors");
        chkDebugFakeColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkDebugFakeColorItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlAppearance.add(chkDebugFakeColor, gridBagConstraints);

        chkDebugFastDrag.setSelected(Settings.getDebugFastDrag());
        chkDebugFastDrag.setText("[Debug] Render wireframes when dragging");
        chkDebugFastDrag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkDebugFastDragItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlAppearance.add(chkDebugFastDrag, gridBagConstraints);

        pnlAreaColors.setMaximumSize(new java.awt.Dimension(525, 2147483647));
        pnlAreaColors.setPreferredSize(new java.awt.Dimension(525, 80));
        pnlAreaColors.setLayout(new java.awt.GridBagLayout());

        lblAreaColors.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAreaColors.setText("Area Colors");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlAreaColors.add(lblAreaColors, gridBagConstraints);

        lblNormalAreaColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNormalAreaColor.setText("Normal Area");
        lblNormalAreaColor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 1.0;
        pnlAreaColors.add(lblNormalAreaColor, gridBagConstraints);

        btnNormalAreaPrimaryColor.setBackground(Settings.getNormalAreaPrimaryColor()
        );
        btnNormalAreaPrimaryColor.setText(" ");
        btnNormalAreaPrimaryColor.setToolTipText("Primary");
        btnNormalAreaPrimaryColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnNormalAreaPrimaryColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalAreaPrimaryColorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        pnlAreaColors.add(btnNormalAreaPrimaryColor, gridBagConstraints);

        btnNormalAreaSecondaryColor.setBackground(Settings.getNormalAreaSecondaryColor());
        btnNormalAreaSecondaryColor.setText(" ");
        btnNormalAreaSecondaryColor.setToolTipText("Secondary");
        btnNormalAreaSecondaryColor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNormalAreaSecondaryColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalAreaSecondaryColorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        pnlAreaColors.add(btnNormalAreaSecondaryColor, gridBagConstraints);

        lblCameraAreaColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCameraAreaColor.setText("Camera Area");
        lblCameraAreaColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 1.0;
        pnlAreaColors.add(lblCameraAreaColor, gridBagConstraints);

        btnCameraAreaPrimaryColor.setBackground(Settings.getCameraAreaPrimaryColor());
        btnCameraAreaPrimaryColor.setText(" ");
        btnCameraAreaPrimaryColor.setToolTipText("Primary");
        btnCameraAreaPrimaryColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCameraAreaPrimaryColorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        pnlAreaColors.add(btnCameraAreaPrimaryColor, gridBagConstraints);

        btnCameraAreaSecondaryColor.setBackground(Settings.getCameraAreaSecondaryColor());
        btnCameraAreaSecondaryColor.setText(" ");
        btnCameraAreaSecondaryColor.setToolTipText("Secondary");
        btnCameraAreaSecondaryColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCameraAreaSecondaryColorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        pnlAreaColors.add(btnCameraAreaSecondaryColor, gridBagConstraints);

        lblGravityAreaColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGravityAreaColor.setText("Gravity Area");
        lblGravityAreaColor.setMaximumSize(new java.awt.Dimension(63, 16));
        lblGravityAreaColor.setMinimumSize(new java.awt.Dimension(63, 16));
        lblGravityAreaColor.setPreferredSize(new java.awt.Dimension(63, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pnlAreaColors.add(lblGravityAreaColor, gridBagConstraints);

        btnGravityAreaPrimaryColor.setBackground(Settings.getGravityAreaPrimaryColor());
        btnGravityAreaPrimaryColor.setText(" ");
        btnGravityAreaPrimaryColor.setToolTipText("Primary");
        btnGravityAreaPrimaryColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravityAreaPrimaryColorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        pnlAreaColors.add(btnGravityAreaPrimaryColor, gridBagConstraints);

        btnGravityAreaSecondaryColor.setBackground(Settings.getGravityAreaSecondaryColor());
        btnGravityAreaSecondaryColor.setText(" ");
        btnGravityAreaSecondaryColor.setToolTipText("Secondary");
        btnGravityAreaSecondaryColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravityAreaSecondaryColorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        pnlAreaColors.add(btnGravityAreaSecondaryColor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        pnlAppearance.add(pnlAreaColors, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 2.0;
        pnlSettings.add(pnlAppearance, gridBagConstraints);

        pnlControls.setLayout(new java.awt.GridBagLayout());

        lblControls.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblControls.setText("Controls");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        pnlControls.add(lblControls, gridBagConstraints);

        chkUseReverseRot.setSelected(Settings.getUseReverseRot());
        chkUseReverseRot.setText("Invert camera motion");
        chkUseReverseRot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkUseReverseRotItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlControls.add(chkUseReverseRot, gridBagConstraints);

        chkUseWASD.setSelected(Settings.getUseWASD());
        chkUseWASD.setText("Use WASD over arrow keys");
        chkUseWASD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkUseWASDItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlControls.add(chkUseWASD, gridBagConstraints);

        btnPosition.setText("[not set]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlControls.add(btnPosition, gridBagConstraints);

        lblPosition.setText("Position");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlControls.add(lblPosition, gridBagConstraints);

        lblRotation.setText("Rotation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlControls.add(lblRotation, gridBagConstraints);

        btnRotation.setText("[not set]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlControls.add(btnRotation, gridBagConstraints);

        btnScale.setText("[not set]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlControls.add(btnScale, gridBagConstraints);

        lblScale.setText("Scale");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlControls.add(lblScale, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.weighty = 4.0;
        pnlSettings.add(pnlControls, gridBagConstraints);

        pnlMisc.setPreferredSize(new java.awt.Dimension(265, 62));
        pnlMisc.setLayout(new java.awt.GridBagLayout());

        lblBaseGame.setText("Base Game Path (For objects only)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlMisc.add(lblBaseGame, gridBagConstraints);

        lblMisc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMisc.setText("Misc.");
        pnlMisc.add(lblMisc, new java.awt.GridBagConstraints());

        txtBaseGame.setText(Settings.getBaseGameDir());
        txtBaseGame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBaseGameKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlMisc.add(txtBaseGame, gridBagConstraints);

        btnBrowseBaseGamePath.setText("Browse...");
        btnBrowseBaseGamePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseBaseGamePathActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnlMisc.add(btnBrowseBaseGamePath, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlSettings.add(pnlMisc, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(pnlSettings, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Settings.setKeyPosition(((KeybindButton)btnPosition).keybind);
        Settings.setKeyRotation(((KeybindButton)btnRotation).keybind);
        Settings.setKeyScale(((KeybindButton)btnScale).keybind);
    }//GEN-LAST:event_formWindowClosing

    private void chkUseBetterQualityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkUseBetterQualityItemStateChanged
        Settings.setUseBetterQuality(evt.getStateChange() == ItemEvent.SELECTED);
    }//GEN-LAST:event_chkUseBetterQualityItemStateChanged

    private void btnBrowseBaseGamePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseBaseGamePathActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Open a base SMG1/2 Directory");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        String lastGameDir = Settings.getBaseGameDir();
        if (lastGameDir != null && lastGameDir.length() > 0) {
            fc.setSelectedFile(new File(lastGameDir));
        }

        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String pth = fc.getSelectedFile().getPath();
            txtBaseGame.setText(pth);
            setBaseGamePath(pth);
        }
    }//GEN-LAST:event_btnBrowseBaseGamePathActionPerformed

    private void txtBaseGameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBaseGameKeyReleased
        String pth = txtBaseGame.getText();
        setBaseGamePath(pth);
    }//GEN-LAST:event_txtBaseGameKeyReleased

    private void chkUseWASDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkUseWASDItemStateChanged
        Settings.setUseWASD(evt.getStateChange() == ItemEvent.SELECTED);
    }//GEN-LAST:event_chkUseWASDItemStateChanged

    private void chkUseReverseRotItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkUseReverseRotItemStateChanged
        Settings.setUseReverseRot(evt.getStateChange() == ItemEvent.SELECTED);
    }//GEN-LAST:event_chkUseReverseRotItemStateChanged

    private void chkDebugFastDragItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkDebugFastDragItemStateChanged
        Settings.setDebugFastDrag(evt.getStateChange() == ItemEvent.SELECTED);
    }//GEN-LAST:event_chkDebugFastDragItemStateChanged

    private void chkDebugFakeColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkDebugFakeColorItemStateChanged
        Settings.setDebugFakeColor(evt.getStateChange() == ItemEvent.SELECTED);
    }//GEN-LAST:event_chkDebugFakeColorItemStateChanged

    private void chkUseDarkModeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkUseDarkModeItemStateChanged
        Settings.setUseDarkMode(evt.getStateChange() == ItemEvent.SELECTED);
        Whitehole.requestUpdateLAF();
    }//GEN-LAST:event_chkUseDarkModeItemStateChanged

    private void chkDebugAdditionalLogsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkDebugAdditionalLogsItemStateChanged
        Settings.setDebugAdditionalLogs(evt.getStateChange() == ItemEvent.SELECTED);
        
    }//GEN-LAST:event_chkDebugAdditionalLogsItemStateChanged

    private void btnNormalAreaPrimaryColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalAreaPrimaryColorActionPerformed
        Color oldPrimaryColor = btnNormalAreaPrimaryColor.getBackground();
        Color newPrimaryColor = getNewAreaColor(oldPrimaryColor, Settings.DEFAULT_NORMAL_AREA_PRIMARY_COLOR, true);
        
        if (newPrimaryColor != null) {
            // set primary color
            btnNormalAreaPrimaryColor.setBackground(newPrimaryColor);
            Settings.setNormalAreaPrimaryColor(newPrimaryColor);
            
            // set secondary color if auto
            Color oldSecondaryColor = getComplement(Settings.getNormalAreaSecondaryColor());
            if (oldPrimaryColor.equals(oldSecondaryColor)) {
                btnNormalAreaSecondaryColor.setBackground(getComplement(newPrimaryColor));
                Settings.setNormalAreaSecondaryColor(getComplement(newPrimaryColor));
            }
        }
    }//GEN-LAST:event_btnNormalAreaPrimaryColorActionPerformed

    private void btnCameraAreaPrimaryColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCameraAreaPrimaryColorActionPerformed
        Color oldPrimaryColor = btnCameraAreaPrimaryColor.getBackground();
        Color newPrimaryColor = getNewAreaColor(oldPrimaryColor, Settings.DEFAULT_CAMERA_AREA_PRIMARY_COLOR, true);
        
        if (newPrimaryColor != null) {
            // set primary color
            btnCameraAreaPrimaryColor.setBackground(newPrimaryColor);
            Settings.setCameraAreaPrimaryColor(newPrimaryColor);
            
            // set secondary color if auto
            Color oldSecondaryColor = getComplement(Settings.getCameraAreaSecondaryColor());
            if (oldPrimaryColor.equals(oldSecondaryColor)) {
                btnCameraAreaSecondaryColor.setBackground(getComplement(newPrimaryColor));
                Settings.setCameraAreaSecondaryColor(getComplement(newPrimaryColor));
            }
        }
    }//GEN-LAST:event_btnCameraAreaPrimaryColorActionPerformed

    private void btnGravityAreaPrimaryColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravityAreaPrimaryColorActionPerformed
        Color oldPrimaryColor = btnGravityAreaPrimaryColor.getBackground();
        Color newPrimaryColor = getNewAreaColor(oldPrimaryColor, Settings.DEFAULT_GRAVITY_AREA_PRIMARY_COLOR, true);
        
        if (newPrimaryColor != null) {
            // set primary color
            btnGravityAreaPrimaryColor.setBackground(newPrimaryColor);
            Settings.setGravityAreaPrimaryColor(newPrimaryColor);
            
            // set secondary color if auto
            Color oldSecondaryColor = getComplement(Settings.getGravityAreaSecondaryColor());
            if (oldPrimaryColor.equals(oldSecondaryColor)) {
                btnGravityAreaSecondaryColor.setBackground(getComplement(newPrimaryColor));
                Settings.setGravityAreaSecondaryColor(getComplement(newPrimaryColor));
            }
        }
    }//GEN-LAST:event_btnGravityAreaPrimaryColorActionPerformed

    private void btnNormalAreaSecondaryColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalAreaSecondaryColorActionPerformed
        Color oldSecondaryColor = btnNormalAreaSecondaryColor.getBackground();
        Color newSecondaryColor = getNewAreaColor(oldSecondaryColor, getComplement(Settings.getNormalAreaPrimaryColor()), false);
        
        if (newSecondaryColor != null) {
            // set secondary color
            btnNormalAreaSecondaryColor.setBackground(newSecondaryColor);
            Settings.setNormalAreaSecondaryColor(newSecondaryColor);
        }
    }//GEN-LAST:event_btnNormalAreaSecondaryColorActionPerformed

    private void btnCameraAreaSecondaryColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCameraAreaSecondaryColorActionPerformed
        Color oldSecondaryColor = btnCameraAreaSecondaryColor.getBackground();
        Color newSecondaryColor = getNewAreaColor(oldSecondaryColor, getComplement(Settings.getCameraAreaPrimaryColor()), false);
        
        if (newSecondaryColor != null) {
            // set secondary color
            btnCameraAreaSecondaryColor.setBackground(newSecondaryColor);
            Settings.setCameraAreaSecondaryColor(newSecondaryColor);
        }
    }//GEN-LAST:event_btnCameraAreaSecondaryColorActionPerformed

    private void btnGravityAreaSecondaryColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravityAreaSecondaryColorActionPerformed
        Color oldSecondaryColor = btnGravityAreaSecondaryColor.getBackground();
        Color newSecondaryColor = getNewAreaColor(oldSecondaryColor, getComplement(Settings.getGravityAreaPrimaryColor()), false);
        
        if (newSecondaryColor != null) {
            // set secondary color
            btnGravityAreaSecondaryColor.setBackground(newSecondaryColor);
            Settings.setGravityAreaSecondaryColor(newSecondaryColor);
        }
    }//GEN-LAST:event_btnGravityAreaSecondaryColorActionPerformed
    
    private void setBaseGamePath(String pth)
    {     
        if (pth.equals(""))
        {
            //Empty the path
            Settings.setBaseGameDir("");
            System.out.println("Base path unset.");
            return;
        }
        
        File dir = new File(pth);
        if (dir.exists() && dir.isDirectory())
        {
            if (pth.endsWith("/") || pth.endsWith("\\"))
                pth = pth.substring(0, pth.length()-1);
            Settings.setBaseGameDir(pth);
            System.out.println("valid Base path has been set!");
        }
        else
            System.out.println("invalid path inserted!");
    }
    
    class OkTracker implements ActionListener {
        JColorChooser chooser;
        Color color;

        public OkTracker(JColorChooser c) {
            chooser = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            color = chooser.getColor();
        }

        public Color getColor() {
            return color;
        }
    }
    
    private Color getNewAreaColor(Color defaultColor, Color baseColor, boolean primary) {
        // Get only the RGB panel from the color chooser
        AbstractColorChooserPanel panel = null;
        JColorChooser cc = new JColorChooser();
        AbstractColorChooserPanel[] panels = cc.getChooserPanels();
        for (AbstractColorChooserPanel accp : panels) {
            if (accp.getDisplayName().equals("HSV")) {
                panel = accp;
            }
        }
        
        if (panel == null)
            return defaultColor;
        // Customize the color chooser
        cc.setColor(defaultColor);
        AbstractColorChooserPanel[] newPanels = {panel};
        cc.setChooserPanels(newPanels);
        OkTracker ok = new OkTracker(cc);
        JDialog dialog = JColorChooser.createDialog(cc, Whitehole.NAME, true, cc, ok, null);
        JPanel pnlButtons = (JPanel)dialog.getContentPane().getComponent(1);
        String btnResetColorText = "Reset to Base Color";
        if (!primary) {
            btnResetColorText = "Reset to Auto Color";
        }
        JButton btnResetColor = new JButton(btnResetColorText, null);
        btnResetColor.addActionListener((java.awt.event.ActionEvent evt) -> {
            cc.setColor(baseColor);
        });
        pnlButtons.add(btnResetColor);
        panel.setColorTransparencySelectionEnabled(false);
        dialog.setVisible(true);
        return ok.getColor();
    }
    
    private Color getComplement(Color clr) {
        float[] hsbColor = Color.RGBtoHSB(clr.getRed(), clr.getGreen(), clr.getBlue(), null);
        hsbColor[0] = (hsbColor[0] + 0.5f) > 1.0f ? hsbColor[0] - 0.5f : hsbColor[0] + 0.5f;
        return new Color(Color.HSBtoRGB(hsbColor[0], hsbColor[1], hsbColor[2]));
    }
    
    private static class KeybindButton extends JButton {
        boolean binding = false;
        int keybind = -1;
        
        public KeybindButton() {
            super();

            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    if (!binding) {
                        return;
                    }

                    setKeyBind(evt.getKeyCode());
                }
            });

            addActionListener((ActionEvent e) -> {
                if(binding) {
                    keybind = -1;
                }

                binding = !binding;

                if(keybind == -1) {
                    setText("[not set]");
                }

                if(binding = true) {
                    setText(getText() + "...");
                }
            });
        }
        
        public void setKeyBind(int key) {
            keybind = key;
            setText(KeyEvent.getKeyText(keybind));
            binding = false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseBaseGamePath;
    private javax.swing.JButton btnCameraAreaPrimaryColor;
    private javax.swing.JButton btnCameraAreaSecondaryColor;
    private javax.swing.JButton btnGravityAreaPrimaryColor;
    private javax.swing.JButton btnGravityAreaSecondaryColor;
    private javax.swing.JButton btnNormalAreaPrimaryColor;
    private javax.swing.JButton btnNormalAreaSecondaryColor;
    private javax.swing.JButton btnPosition;
    private javax.swing.JButton btnRotation;
    private javax.swing.JButton btnScale;
    private javax.swing.JCheckBox chkDebugAdditionalLogs;
    private javax.swing.JCheckBox chkDebugFakeColor;
    private javax.swing.JCheckBox chkDebugFastDrag;
    private javax.swing.JCheckBox chkUseBetterQuality;
    private javax.swing.JCheckBox chkUseDarkMode;
    private javax.swing.JCheckBox chkUseReverseRot;
    private javax.swing.JCheckBox chkUseWASD;
    private javax.swing.JLabel lblAppearance;
    private javax.swing.JLabel lblAreaColors;
    private javax.swing.JLabel lblBaseGame;
    private javax.swing.JLabel lblCameraAreaColor;
    private javax.swing.JLabel lblControls;
    private javax.swing.JLabel lblGravityAreaColor;
    private javax.swing.JLabel lblMisc;
    private javax.swing.JLabel lblNormalAreaColor;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblRotation;
    private javax.swing.JLabel lblScale;
    private javax.swing.JPanel pnlAppearance;
    private javax.swing.JPanel pnlAreaColors;
    private javax.swing.JPanel pnlControls;
    private javax.swing.JPanel pnlMisc;
    private javax.swing.JPanel pnlSettings;
    private javax.swing.JTextField txtBaseGame;
    // End of variables declaration//GEN-END:variables
}
