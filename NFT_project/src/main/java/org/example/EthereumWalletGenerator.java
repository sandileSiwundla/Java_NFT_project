package org.example;

import org.web3j.crypto.*;
import java.io.File;

public class EthereumWalletGenerator {
    public static void main(String[] args) throws Exception {
        String walletDirectory = "src/main/wallets"; // Change to your preferred directory
        String password = "strongpassword"; // Change to a secure password

        // Generate Wallet File
        Bip39Wallet bip39Wallet = WalletUtils.generateBip39Wallet(password, new File(walletDirectory));
        Credentials credentials = WalletUtils.loadBip39Credentials(password, bip39Wallet.getMnemonic());

        System.out.println("Wallet Address: " + credentials.getAddress());
        System.out.println("Mnemonic: " + bip39Wallet.getMnemonic());
    }
}