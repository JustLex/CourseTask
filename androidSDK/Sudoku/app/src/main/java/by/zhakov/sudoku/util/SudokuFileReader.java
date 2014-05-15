package by.zhakov.sudoku.util;

import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by Aleksei on 15.05.14.
 */
public class SudokuFileReader {
    public int[][] getRandSudoku(File f){
        try{
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            int count = Integer.parseInt(br.readLine());
            int rand = (int)Math.round(Math.random()*count);
            for (int i = 0; i < rand - 1; i++){
                br.readLine();
            }
            String[] sudoku = br.readLine().split(" ");
            int[][] result = new int[9][9];
            for (int i = 0; i < 9; i++){
                for (int q = 0; q < 9; q++){
                    result[i][q] = Integer.parseInt(sudoku[i*9 + q]);
                }
            }
            return result;
        } catch (Exception e){
            Log.e(this.getClass().toString(), "FILE EXCEPTION", e);
        }
        return null;
    }
}
