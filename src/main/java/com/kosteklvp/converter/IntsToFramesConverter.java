package com.kosteklvp.converter;

import static com.kosteklvp.bowling.BowlingUtils.NUMBER_OF_NORMAL_FRAMES_IN_A_GAME;
import static com.kosteklvp.bowling.BowlingUtils.isStrike;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kosteklvp.bowling.frame.Frame;
import com.kosteklvp.bowling.frame.NormalFrame;
import com.kosteklvp.bowling.frame.TenthFrame;
import com.kosteklvp.exception.IncorrectNumberOfNumbersException;

public class IntsToFramesConverter implements Converter<List<Integer>, List<Frame>> {

  @Override
  public List<Frame> convert(List<Integer> ints) {
    List<Frame> frames = new ArrayList<>();

    Iterator<Integer> iterator = ints.iterator();

    frames.addAll(createNormalFrames(iterator));
    frames.add(createTenthFrame(iterator));

    return frames;
  }

  private List<Frame> createNormalFrames(Iterator<Integer> iterator) {
    List<Frame> frames = new ArrayList<>();

    while (frames.size() < NUMBER_OF_NORMAL_FRAMES_IN_A_GAME) {
      Integer numberOfPinsKnockedInFirstRoll = iterator.next();

      if (isStrike(numberOfPinsKnockedInFirstRoll)) {
        frames.add(NormalFrame.strike());
        continue;
      }

      Integer numberOfPinsKnockedInSecondRoll = iterator.next();

      frames.add(NormalFrame.create(numberOfPinsKnockedInFirstRoll, numberOfPinsKnockedInSecondRoll));
    }

    return frames;
  }

  private Frame createTenthFrame(Iterator<Integer> iterator) {
    Integer numberOfPinsKnockedInFirstRoll = iterator.hasNext() ? iterator.next() : null;
    Integer numberOfPinsKnockedInSecondRoll = iterator.hasNext() ? iterator.next() : null;
    Integer numberOfPinsKnockedInThirdRoll = iterator.hasNext() ? iterator.next() : null;

    if (numberOfPinsKnockedInFirstRoll == null || numberOfPinsKnockedInSecondRoll == null) {
      throw new IncorrectNumberOfNumbersException();
    }

    return TenthFrame.create(numberOfPinsKnockedInFirstRoll, numberOfPinsKnockedInSecondRoll, numberOfPinsKnockedInThirdRoll);
  }

}
