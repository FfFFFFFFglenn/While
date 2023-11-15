/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilikaausiyamini.store;

import javax.swing.JOptionPane;

/**
 *
 * @author Fedrequilan_CPE
 */
public class DilikaausiyaminiStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String YOURNAME = JOptionPane.showInputDialog("Welcome to the Dili Kaayo Siya Mini Store!\nName:");
        if (YOURNAME == null) {
            JOptionPane.showMessageDialog(null, "Okaaaaayyyyy Byeeee!!");
            System.exit(0);
        }

        String[] items = {"Flashlight - P125.50", "Boots - P312", "Umbrella - P263", "Raincoat- P255 ", "Bag - P999"};
        double[] prices = {125.50, 312.0, 263.0, 255.0, 999.0};
        double totalCost = 0.00;
        double paramakadiscount2 = 1800.0; //Pila ang dapat mabayran para maka avail ug discount 2.
        double discount2 = 0.15; //15%

        StringBuilder receipt = new StringBuilder("Receipt for " + YOURNAME + "\n");

        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Pagpili ug gusto nimo na item " + YOURNAME, "Dili Kaayo Ni Siya Mini Store",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, items, items[0]);

            if (choice == -1) {
                JOptionPane.showMessageDialog(null, "Okaaaaayyyyy Byeeee!!");
                System.exit(0);
                break; // Pag i cancel
            }

            int quantity;
            while (true) {
                try {
                    String quantityString = JOptionPane.showInputDialog("Enter quantity for " + items[choice]);
                    if (quantityString == null) {
                        JOptionPane.showMessageDialog(null, "Okaaaaayyyyy Byeeee!!");
                        System.exit(0);
                    }

                    quantity = Integer.parseInt(quantityString);

                    if (quantity < 0) {
                        throw new NumberFormatException();
                    }

                    if (quantityString.contains(".")) {
                        throw new NumberFormatException();
                    }

                    break; // Exit ang loop pag satisfy ang condition
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "WHOLE NUMBER LANG ANG PWEDE.", "OPPSSSS DILI NA PWEDE", JOptionPane.WARNING_MESSAGE);
                }
            }

            double itemCost = prices[choice] * quantity;
            totalCost += itemCost;

            receipt.append(items[choice]).append(" x ").append(quantity).append(": P").append(itemCost).append("\n");

            int addAnotherItem = JOptionPane.showConfirmDialog(null, "Do you want to add another item?", "Add Item",
                    JOptionPane.YES_NO_OPTION);

            if (addAnotherItem == JOptionPane.NO_OPTION) {
                break; // Dli na ganahan pa mu add
            }
        }

        if (totalCost >= paramakadiscount2) {
            double discountAmount = totalCost * discount2;
            totalCost -= discountAmount;
            receipt.append("Discount (15%): -P").append(discountAmount).append("\n");

            JOptionPane.showMessageDialog(
                    null,
                    "Congratulations! Maka discount kag 15%, kay nakaabot/nalapas kag P" + paramakadiscount2,
                    "Discount Offer",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        String paymentString = JOptionPane.showInputDialog("Your Total Cost is:P" + totalCost + " \nEnter payment amount (P):");
        if (paymentString == null) {
            JOptionPane.showMessageDialog(null, "Okaaaaayyyyy Byeeee!!");
            System.exit(0);
        }
        double payment = Double.parseDouble(paymentString);

        double change = payment - totalCost;

        if (change < 0) {
            JOptionPane.showMessageDialog(null, "Kulang imong kwarta byeeeee.", "Payment Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (change > 0) {
            receipt.append("Total Cost: P").append(totalCost).append("\n");
            receipt.append("Payment: P").append(payment).append("\n");
            receipt.append("Change: P").append(change);

            JOptionPane.showMessageDialog(null, receipt.toString(), "Mini Store Receipt", JOptionPane.INFORMATION_MESSAGE);
        } else if (change == 0) {

            receipt.append("Total Cost: P").append(totalCost).append("\n");
            receipt.append("Payment: P").append(payment).append("\n");
            receipt.append("Change: P").append(change);
            JOptionPane.showMessageDialog(null, receipt.toString(), "Mini Store Receipt", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO code application logic here
    }
}
