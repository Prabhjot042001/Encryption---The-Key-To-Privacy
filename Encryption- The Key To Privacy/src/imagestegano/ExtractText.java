
package imagestegano;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import steganography.LSBEncoding;
import utility.ImageUtility;


public class ExtractText extends javax.swing.JFrame {

    JFileChooser fileChooser;
    File textFile;
    BufferedImage coverImage;
    ImageUtility imageUtility;
    ColorModel coverImageColorModel;
    File openedFile;
    
    // an array to hold all bits checkboxes
    JCheckBox bitsCheckBoxArray[] = new JCheckBox[8];
    
    /**
     * Creates new form ExtractText
     */
    public ExtractText() {
        initComponents();
        fileChooser = new JFileChooser();
        imageUtility = new ImageUtility();

        bitsCheckBoxArray[0] = bit0CheckBox;
        bitsCheckBoxArray[1] = bit1CheckBox;
        bitsCheckBoxArray[2] = bit2CheckBox;
        bitsCheckBoxArray[3] = bit3CheckBox;
        bitsCheckBoxArray[4] = bit4CheckBox;
        bitsCheckBoxArray[5] = bit5CheckBox;
        bitsCheckBoxArray[6] = bit6CheckBox;
        bitsCheckBoxArray[7] = bit7CheckBox;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        modifyBitsPanel = new javax.swing.JPanel();
        bit7CheckBox = new javax.swing.JCheckBox();
        bit6CheckBox = new javax.swing.JCheckBox();
        bit5CheckBox = new javax.swing.JCheckBox();
        bit4CheckBox = new javax.swing.JCheckBox();
        bit3CheckBox = new javax.swing.JCheckBox();
        bit2CheckBox = new javax.swing.JCheckBox();
        bit1CheckBox = new javax.swing.JCheckBox();
        bit0CheckBox = new javax.swing.JCheckBox();
        chooseCoverImageButton = new javax.swing.JButton();
        extractTextButton = new javax.swing.JButton();
        outputTextArea = new java.awt.TextArea();
        coverImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Extract Text");

        jLabel1.setText("Choose Cover Image:");

        modifyBitsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Modify Bits"));

        bit7CheckBox.setText("7");

        bit6CheckBox.setText("6");

        bit5CheckBox.setText("5");

        bit4CheckBox.setText("4");

        bit3CheckBox.setText("3");

        bit2CheckBox.setText("2");

        bit1CheckBox.setText("1");

        bit0CheckBox.setText("0");

        javax.swing.GroupLayout modifyBitsPanelLayout = new javax.swing.GroupLayout(modifyBitsPanel);
        modifyBitsPanel.setLayout(modifyBitsPanelLayout);
        modifyBitsPanelLayout.setHorizontalGroup(
            modifyBitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyBitsPanelLayout.createSequentialGroup()
                .addComponent(bit7CheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bit6CheckBox)
                .addGap(18, 18, 18)
                .addComponent(bit5CheckBox)
                .addGap(18, 18, 18)
                .addComponent(bit4CheckBox)
                .addGap(18, 18, 18)
                .addComponent(bit3CheckBox)
                .addGap(18, 18, 18)
                .addComponent(bit2CheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bit1CheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bit0CheckBox)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        modifyBitsPanelLayout.setVerticalGroup(
            modifyBitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyBitsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(modifyBitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bit7CheckBox)
                    .addComponent(bit6CheckBox)
                    .addComponent(bit5CheckBox)
                    .addComponent(bit4CheckBox)
                    .addComponent(bit3CheckBox)
                    .addComponent(bit2CheckBox)
                    .addComponent(bit1CheckBox)
                    .addComponent(bit0CheckBox))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        chooseCoverImageButton.setText("Choose Cover Image");
        chooseCoverImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCoverImageButtonActionPerformed(evt);
            }
        });

        extractTextButton.setText("Extract Text");
        extractTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractTextButtonActionPerformed(evt);
            }
        });

        coverImageLabel.setForeground(new java.awt.Color(140, 56, 104));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifyBitsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(chooseCoverImageButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coverImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(outputTextArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(extractTextButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseCoverImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coverImageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifyBitsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(extractTextButton)
                .addGap(22, 22, 22))
        );

        outputTextArea.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseCoverImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCoverImageButtonActionPerformed
        fileChooser.setDialogTitle("Select an image");
        ImageFileFilter imageFilter = new ImageFileFilter();
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            openedFile = fileChooser.getSelectedFile();
            String name = openedFile.getName();
            try {
                if (imageFilter.isPNGOrBMPImage(name)) {
                    coverImage = ImageIO.read(openedFile);

                    // converting original image to suitable type
                    BufferedImage currentImage
                            = imageUtility.convertImage(coverImage);
                    if (currentImage != null) {
                        coverImage = currentImage;
                    }

                    coverImageColorModel = coverImage.getColorModel();
                    coverImageLabel.setText(name + ", size: "
                            + openedFile.length() / 1024 + " KB, "
                            + coverImage.getWidth() + "X"
                            + coverImage.getHeight());
                } else {
                    alert("Please select only .png or .bmp image");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_chooseCoverImageButtonActionPerformed

    private void extractTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractTextButtonActionPerformed
        if (coverImage == null) {
            alert("No cover Image selected");
            return;
        }
        LSBEncoding lsbEncoding = new LSBEncoding();
        int bitArray[] = new int[8];
        for (int i = 0; i < 8; i++) {
            if (bitsCheckBoxArray[i].isSelected()) {
                bitArray[i] = 1;
            } else {
                bitArray[i] = 0;
            }
        }
        String message = lsbEncoding.decodeText(coverImage, bitArray);
        outputTextArea.setText(message);
    }//GEN-LAST:event_extractTextButtonActionPerformed

    /**
     *  args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExtractText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtractText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtractText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtractText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExtractText().setVisible(true);
            }
        });
    }
    
    private void alert(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bit0CheckBox;
    private javax.swing.JCheckBox bit1CheckBox;
    private javax.swing.JCheckBox bit2CheckBox;
    private javax.swing.JCheckBox bit3CheckBox;
    private javax.swing.JCheckBox bit4CheckBox;
    private javax.swing.JCheckBox bit5CheckBox;
    private javax.swing.JCheckBox bit6CheckBox;
    private javax.swing.JCheckBox bit7CheckBox;
    private javax.swing.JButton chooseCoverImageButton;
    private javax.swing.JLabel coverImageLabel;
    private javax.swing.JButton extractTextButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel modifyBitsPanel;
    private java.awt.TextArea outputTextArea;
    // End of variables declaration//GEN-END:variables
}
