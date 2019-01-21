package com.senchenko.ball.reader;

import com.senchenko.ball.exeption.BallException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateFileReader {
        private final static String DEFAULT_PATH = "input/input.txt";
        private static List<String> list;

    public static List<String> read(String path) throws BallException, RuntimeException {
        if((new File(path)).exists()){
            try (Stream<String> stream = Files.lines(Paths.get(path))){
                list = stream.collect(Collectors.toList());
            } catch (IOException e) {
                throw new BallException(e);
            }
        }else {
            try (Stream<String> stream = Files.lines(Paths.get(DEFAULT_PATH))){
                list = stream.collect(Collectors.toList());
            } catch (IOException e) {
                throw new BallException(e);
            }
        }
        return list;
    }
}
