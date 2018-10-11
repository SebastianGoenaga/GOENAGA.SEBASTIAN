package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.util.List;

import edu.eci.pdsw.entities.Comment;

public interface CommentMapper {

	List<Comment> searchOffensiveLanguageComments();

}
