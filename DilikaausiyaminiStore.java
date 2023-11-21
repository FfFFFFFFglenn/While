/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.glennstore;
/**
 *
 * @author Acer
 */
import javax.swing.JOptionPane;

public class DilikaausiyaminiStore {

    public static void main(String[] args) {

        while (true) {
            String YOURNAME = JOptionPane.showInputDialog("Welcome to the Dili Kaayo Siya Mini Store!\nName:");
            if (YOURNAME == null) {
                JOptionPane.showMessageDialog(null, "Okaaaaayyyyy Byeeee!!");
                System.exit(0);
            }

            String[] items = {"Flashlight - P125.50", "Boots - P312", "Umbrella - P263", "Raincoat- P255 ", "Bag - P999"};
            double[] prices = {125.50, 312.0, 263.0, 255.0, 999.0};
            double totalCost = 0.00;
            double paramakadiscount2 = 1800.0; // Pila ang dapat mabayran para maka avail ug discount 2.
            double discount2 = 0.15; // 15%

            StringBuilder receipt = new StringBuilder("Receipt for " + YOURNAME + "\n");

            while (true) {
                int choice = JOptionPane.showOptionDialog(null, "Pagpili ug gusto nimo na item " + YOURNAME,
                        "Dili Kaayo Ni Siya Mini Store", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, items, items[0]);

                if (choice == -1) {
                    JOptionPane.showMessageDialog(null, "Okaaaaayyyyy Byeeee!!");
                    System.exit(0);
                }

                int quantity = 0;
                boolean isValidQuantity = false;
                while (!isValidQuantity) {
                    String quantityString = JOptionPane.showInputDialog("Enter quantity for " + items[choice]);
                    if (quantityString == null) {
                        JOptionPane.showMessageDialog(null, "Okaaaaayyyyy Byeeee!!");
                        System.exit(0);
                    }
                    if (quantityString.matches("\\d+")) {
                        quantity = Integer.parseInt(quantityString);
                        if (quantity > 0) {
                            isValidQuantity = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter a valid positive whole number for the quantity.", "Invalid Quantity", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid positive whole number for the quantity.", "Invalid Quantity", JOptionPane.WARNING_MESSAGE);
                    }
                }

                double itemCost = prices[choice] * quantity;
                totalCost += itemCost;

                receipt.append(items[choice]).append(" x ").append(quantity).append(": P").append(itemCost).append("\n");

                int addAnotherItem = JOptionPane.showConfirmDialog(null, "Do you want to add another item?", "Add Item",
                        JOptionPane.YES_NO_OPTION);

                if (addAnotherItem == JOptionPane.NO_OPTION) {
                    break;
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

            String paymentString;
            double payment;
            while (true) {
                paymentString = JOptionPane.showInputDialog("Your Total Cost is: P" + totalCost + "\nEnter payment amount (P):");
                if (paymentString == null) {
                    JOptionPane.showMessageDialog(null, "Okaaaaayyyyy Byeeee!!");
                    System.exit(0);
                }
                payment = Double.parseDouble(paymentString);
                if (payment >= totalCost) {
                    break;
                } else {
                    int addMoreMoney = JOptionPane.showConfirmDialog(null, "Kulang imong bayad, " + YOURNAME + ". Mag-add kag bayad?", "HOYYYY!!",
                            JOptionPane.YES_NO_OPTION);
                    if (addMoreMoney == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Kulang jud imong bayad. Sorryyy Byeeee!!");
                        System.exit(0);
                    }
                }
            }

            double change = payment - totalCost;

            receipt.append("Total Cost: P").append(totalCost).append("\n");
            receipt.append("Payment: P").append(payment).append("\n");
            receipt.append("Change: P").append(change);

            JOptionPane.showMessageDialog(null, receipt.toString(), "Mini Store Receipt", JOptionPane.INFORMATION_MESSAGE);

            int continuePurchase = JOptionPane.showConfirmDialog(null, "Do you want to make another purchase?", "Continue",
                    JOptionPane.YES_NO_OPTION);

            if (continuePurchase == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you!!!!! Sunod na sad!!");
                System.exit(0);
            }
        }
    }
}
