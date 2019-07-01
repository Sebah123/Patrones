/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author sebit
 */
public class Tarjeta {

    private int id;
    private ArrayList<String> A;
    private ArrayList<String> B;
    private ArrayList<String> C;
    private ArrayList<String> D;
    private ArrayList<String> E;
    private String usuario;
    private int estado;

    public Tarjeta(int id, ArrayList<String> A, ArrayList<String> B, ArrayList<String> C, ArrayList<String> D, ArrayList<String> E, String usuario, int estado) {
        this.id = id;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.usuario = usuario;
        this.estado = estado;
    }
    public Tarjeta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getA() {
        return A;
    }

    public void setA(ArrayList<String> A) {
        this.A = A;
    }

    public ArrayList<String> getB() {
        return B;
    }

    public void setB(ArrayList<String> B) {
        this.B = B;
    }

    public ArrayList<String> getC() {
        return C;
    }

    public void setC(ArrayList<String> C) {
        this.C = C;
    }

    public ArrayList<String> getD() {
        return D;
    }

    public void setD(ArrayList<String> D) {
        this.D = D;
    }

    public ArrayList<String> getE() {
        return E;
    }

    public void setE(ArrayList<String> E) {
        this.E = E;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "id=" + id + ", A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", E=" + E + ", usuario=" + usuario + ", estado=" + estado + '}';
    }

    public Object getLetraA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
