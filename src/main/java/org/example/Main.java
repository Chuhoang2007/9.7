package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lop Main cung cap cac phep tinh co ban.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * Tinh tong cua hai so nguyen.
     *
     * @param a so hang thu nhat
     * @param b so hang thu hai
     * @return tong cua a va b
     */
    public static int tinhTong(int a, int b) {
        // Tranh dung tieng Viet co dau trong log neu bot bao loi encoding
        logger.info("Dang tinh tong cua {} va {}", a, b);
        return a + b;
    }
}