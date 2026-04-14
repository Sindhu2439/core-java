class BiometricRunner {
    public static void main(String[] args) {
        Biometric biometric = new Biometric();
        biometric.save("Fingerprint");
        biometric.save("Retina");
        biometric.save("FaceID");
        biometric.save("VoiceScan");
        biometric.save("PalmScan");
        biometric.store("Retina");
        biometric.store("DNAScan");
    }
}