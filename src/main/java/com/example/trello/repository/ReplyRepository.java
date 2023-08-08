package com.example.trello.repository;

import com.example.trello.entity.Board_User;
import com.example.trello.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
    List<Reply> findAllByCardIdOrderByCreatedAtAsc(long id);

    List<Reply> findByUser(Board_User user);
}
