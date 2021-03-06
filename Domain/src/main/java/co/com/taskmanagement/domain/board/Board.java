package co.com.taskmanagement.domain.board;

import co.com.taskmanagement.domain.cardlist.CardList;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class Board {

  private Long id;
  private String name ;
  private String description;
  @Builder.Default
  private Date creationDate = new Date();
  @Builder.Default
  private Date modificationDate = new Date();
  private List<CardList> cardLists;

}
