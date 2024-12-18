package pl.konrad.swierszcz.day17;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private int registerA;
    private int registerB;
    private int registerC;
    private List<Integer> instructions;
    private int instructionPointer;

    public Program(int registerA, int registerB, int registerC, List<Integer> instructions) {
        this.registerA = registerA;
        this.registerB = registerB;
        this.registerC = registerC;
        this.instructions = instructions;
        this.instructionPointer = 0;
    }

    public void reset(int registerA) {
        this.registerA = registerA;
        this.registerB = 0;
        this.registerC = 0;
        instructionPointer = 0;
    }

    public List<Integer> executeProgram() {
        var outputs = new ArrayList<Integer>();
        boolean breaked = false;

        while (instructionPointer < instructions.size() && !breaked) {
            switch (instructions.get(instructionPointer)) {
                case 0 -> {
                    int combo = getCombo(instructionPointer + 1);
                    if (combo < 0) {
                        breaked = true;
                        break;
                    }
                    adv(combo);
                }
                case 1 -> {
                    int combo = getCombo(instructionPointer + 1);
                    if (combo < 0) {
                        breaked = true;
                        break;
                    }
                    bxl(combo);
                }
                case 2 -> {
                    int combo = getCombo(instructionPointer + 1);
                    if (combo < 0) {
                        breaked = true;
                        break;
                    }
                    bst(combo);
                }
                case 3 -> {
                    int combo = getCombo(instructionPointer + 1);
                    if (combo < 0) {
                        breaked = true;
                        break;
                    }
                    jnz(combo);
                }
                case 4 -> bxc();
                case 5 -> {
                    int combo = getCombo(instructionPointer + 1);
                    if (combo < 0) {
                        breaked = true;
                        break;
                    }
                    outputs.add(out(combo));
                }
                case 6 -> {
                    int combo = getCombo(instructionPointer + 1);
                    if (combo < 0) {
                        breaked = true;
                        break;
                    }
                    bdv(combo);
                }
                case 7 -> {
                    int combo = getCombo(instructionPointer + 1);
                    if (combo < 0) {
                        breaked = true;
                        break;
                    }
                    cdv(combo);
                }
            }
        }

        return outputs;
    }

    private int getCombo(int positon) {
        if (positon >= instructions.size()) {
           return -1;
        }

        return instructions.get(positon);
    }

    public void adv(int combo) {
       int denominer = (int) Math.pow(2, getLiteralForCombo(combo));

       registerA = registerA / denominer;
       instructionPointer += 2;
    }

    public void bxl(int combo) {
        registerB = registerB ^ combo;
        instructionPointer += 2;
    }

    public void bst(int combo) {
        int moduloRes = getLiteralForCombo(combo) % 8;
        String bits = Integer.toBinaryString(moduloRes);
        String lastBits = bits.length() > 3 ? bits.substring(bits.length() - 3) : bits;

        registerB = Integer.parseInt(lastBits, 2);
        instructionPointer += 2;
    }

    public void jnz(int combo) {
        if (registerA == 0) {
            instructionPointer += 2;
            return;
        }

        instructionPointer = getLiteralForCombo(combo);
    }

    public void bxc() {
        registerB = registerB ^ registerC;

        instructionPointer += 2;
    }

    public int out(int combo) {
        instructionPointer += 2;
        return getLiteralForCombo(combo) % 8;
    }

    public void bdv(int combo) {
        int denominer = (int) Math.pow(2, getLiteralForCombo(combo));

        registerB = registerA / denominer;
        instructionPointer += 2;
    }

    public void cdv(int combo) {
        int denominer = (int) Math.pow(2, getLiteralForCombo(combo));

        registerC = registerA / denominer;
        instructionPointer += 2;
    }

    private int getLiteralForCombo(int operand) {
        return switch (operand) {
            case 0 -> 0;
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 3;
            case 4 -> registerA;
            case 5 -> registerB;
            case 6 -> registerC;
            default -> throw new RuntimeException("unexpected combo operand");
        };
    }
}
