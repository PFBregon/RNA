package dev.patriciafb.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DNATest {
    @Test
    void testValidDNASequence() {
        DNA dna = new DNA("GCTA");
        assertEquals("GCTA", dna.getSequence());
    }

    @Test
        void testEmptyDNASequence() {
        assertThrows(IllegalArgumentException.class, () -> new DNA(""));
}
}
